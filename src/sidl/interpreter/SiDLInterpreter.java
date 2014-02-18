package sidl.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import sidl.grammar.ast.*;
import sidl.grammar.ast.expressions.numeric.NumExp;
import sidl.interpreter.domain.*;
import sidl.interpreter.visitors.ReferenceResolver;
import sidl.interpreter.visitors.SiDLException;
import sidl.interpreter.visitors.SiDLVisitor;

/**
 * 
 * @author Enrico Zamagni
 */

public abstract class SiDLInterpreter implements SiDLVisitor, ReferenceResolver {
	
	// ambiente
	protected Environment envCurrent = null, envPrevious = null;
	protected Stack<Environment> envstack;
	
	// passaggio parametri
	protected List<Float> params;
	
	// stato cursore
	protected Cursor cursor;
	
	// valutatore espressioni numeriche
	protected NumExpEvaluator numexpeval;
	
	// valutatore espressioni logiche
	protected LogExpEvaluator logexpeval;
	
	// nodo radice dell'AST
	protected ProgramNode rootNode;
	
	// flag di contesto
	protected boolean inFunction = false;
	
	
	public SiDLInterpreter() {
		this.numexpeval = new NumExpEvaluator(this);
		this.logexpeval = new LogExpEvaluator(numexpeval);
	}
	
	
	public void visit(ProgramNode program) {
		// imposto stato iniziale
		this.envstack = new Stack<Environment>();
		this.cursor = new Cursor();
		rootNode = program;
		inFunction = false;
		
		// eseguo procedura principale
		this.params = new ArrayList<Float>(0);
		program.getMainProcedure().accept(this);
	}
	
	
	public void visit(ProcedureNode procedure) {
		// creo nuovo contesto per la procedura
		contextSwitch(new Environment());
		
		// passaggio dei parametri
		int paramcount = procedure.getParameterCount();
		if(paramcount != params.size() ) {
			// error: wrong parameter count
			logError("Wrong parameter count calling procedure " + procedure.getName()
					+ "\n" + params.size() + " instead of " + paramcount, procedure);
		}
		for(int i = 0; i < paramcount; i++) {
			envCurrent.putVar(procedure.getParameter(i).getName(), params.get(i));
		}
		
		// eseguo procedura
		procedure.getBlock().accept(this);
		
		// procedura terminata
		// ripristino contesto precedente
		contextRestore();
	}
	
	public void visit(FunctionNode function) {
		// creo nuovo contesto per la funzione
		contextSwitch(new Environment());
		inFunction = true;
		
		// passaggio dei parametri
		int paramcount = function.getParameterCount();
		if (paramcount != params.size()) {
			// error: wrong parameter count
			inFunction = false;
			logError("Wrong parameter count calling function " + function.getName()
					+ "\n" + params.size() + " instead of " + paramcount, function);
		}
		for (int i = 0; i < paramcount; i++) {
			envCurrent.putVar(function.getParameter(i).getName(), params.get(i));
		}
		
		// eseguo funzione
		BlockNode funcBlock = function.getBlock();
		if(funcBlock != null) {
			function.getBlock().accept(this);
		}
		
		// calcolo valore di ritorno
		function.getReturnExpr().accept(numexpeval);
		
		// procedura terminata
		// ripristino contesto precedente
		contextRestore();
		inFunction = false;
	}
	
	public void visit(BlockNode block) {
		for (int i = 0; i < block.getStatementCount(); i++) {
			block.getStatement(i).accept(this);
		}
	}
	
	public void visit(AssignmentNode assignment) {
		// calcola valore espressione
		assignment.getExprNode().accept(numexpeval);
		float val = numexpeval.getResult();
		// aggiorna environment
		for (int i = 0; i < assignment.getVarCount(); i++) {
			envCurrent.putVar(assignment.getVar(i).getName(), val);
		}
	}
	
	public void visit(PenActionNode action) {
		if(inFunction) {
			// error: actions not allowed in function
			logError("Cursor actions are not allowed inside functions.", action);
		}
		
		if (action.getAction() == Cursor.Action.DROP) {
			// appoggia penna
			cursor.drop();
		} else {
			// solleva penna
			cursor.pull();
		}
	}
	
	public void visit(MoveActionNode action) {
		if(inFunction) {
			// error: actions not allowed in function
			logError("Cursor actions are not allowed inside functions.", action);
		}
		
		Cursor.Direction dir = action.getDirection();
		
		// calcola valore espressione
		action.getAmountExpNode().accept(numexpeval);
		float amount = numexpeval.getResult();
		
		// muovi cursore
		cursor.move(dir, amount);
	}
	
	public void visit(TurnActionNode action) {
		if(inFunction) {
			// error: actions not allowed in function
			logError("Cursor actions are not allowed inside functions.", action);
		}
		
		Cursor.Direction dir = action.getDirection();
		
		// calcola valore espressione
		action.getAmountExpNode().accept(numexpeval);
		float amount = numexpeval.getResult();
		
		// orienta cursore
		cursor.turn(dir, amount);
	}
	
	public void visit(IfControlNode ifnode) {
		// verifico condizioni if/then
		for(int i = 0; i < ifnode.getConditionCount(); i++) {
			ifnode.getCondition(i).accept(logexpeval);
			if(logexpeval.getResult()) {
				// condizione soddisfatta: eseguo questo blocco
				ifnode.getThenBlock(i).accept(this);
				return;
			}
		}
		
		// nessuna condizione soddisfatta: ricorro ad eventuale else
		if(ifnode.hasElseBlock()) {
			ifnode.getElseBlock().accept(this);
		}
	}
	
	public void visit(TestDoLoopControlNode testdoloop) {
		testdoloop.getCondition().accept(logexpeval);
		while(logexpeval.getResult()) {
			testdoloop.getBlock().accept(this);
			testdoloop.getCondition().accept(logexpeval);
		}
	}
	
	public void visit(DoTestLoopControlNode dotestloop) {
		do {
			dotestloop.getBlock().accept(this);
			dotestloop.getCondition().accept(logexpeval);
		} while(logexpeval.getResult());
	}
	
	public void visit(FromToControlNode ftnode) {
		boolean hasIndex = ftnode.hasIndexVar();
		
		String indexvar = null;
		if(hasIndex)
			indexvar = ftnode.getIndexVar().getName();
		
		// calcolo valore di partenza
		ftnode.getStartExpr().accept(numexpeval);
		int startVal = (int) numexpeval.getResult();
		int index = startVal;
		
		// calcolo valore di arrivo
		ftnode.getEndExpr().accept(numexpeval);
		int endVal = (int) numexpeval.getResult();
		
		// dichiaro variabile indice (se presente)
		if(hasIndex)
			envCurrent.putVar(indexvar, startVal);
		
		// imposto stepping
		int step = 1;
		if(endVal < startVal) step = -1;
		
		// ciclo
		boolean endloop = false;
		do {
			// eseguo iterazione
			ftnode.getBlock().accept(this);
			
			// aggiorno indice
			if(index != endVal) {
				index += step;
				if(hasIndex) 
					envCurrent.putVar(indexvar, index);
			} else {
				endloop = true;
			}
		} while(!endloop);
		
	}
	
	public void visit(ProcedureCallNode callnode) {
		if(inFunction) {
			// error: actions not allowed in function
			logError("Procedure calls are not allowed inside functions.", callnode);
		}
		
		// recupero procedura
		ProcedureNode proc = rootNode.getProcedure(callnode.getCalledProcedureName());
		if(proc == null) {
			//errore : undefined procedure
			logError("Undefined procedure " + callnode.getCalledProcedureName(), callnode);
		}
		
		// valuto parametri
		int paramcount = callnode.getParameterCount();
		List<Float> procParams = new ArrayList<Float>(paramcount);
		for (int i = 0; i < paramcount; i++) {
			NumExp p = callnode.getParameter(i);
			p.accept(numexpeval);
			procParams.add(numexpeval.getResult());
		}
		
		// chiamo procedura
		params = procParams;
		proc.accept(this);
	}
	
	public void visit(IdNode idNode) { }
	
	public float resolveVariable(String varName) {
		Float varVal = envCurrent.getVar(varName);
		if(varVal == null) {
			logError("Undefined variable \"" + varName + "\"");
			return Float.NaN;
		} else {
			return varVal;
		}
		
	}
	public float resolveFunction(String funcName, List<Float> params) {
		// recupero funzione
		FunctionNode function = rootNode.getFunction(funcName);
		if(function == null) {
			//errore : undefined function
			logError("Undefined function \"" + funcName + "\"");
			return Float.NaN;
		}
		
		// recupero parametri
		this.params = params;
		
		// chiamo funzione
		function.accept(this);
		
		//restituisco risultato
		return numexpeval.getResult();
	}

	protected void contextSwitch(Environment env) {
		envstack.push(envCurrent);
		envCurrent = env;
	}
	
	protected void contextRestore() {
		envPrevious = envCurrent;
		envCurrent = envstack.pop();
	}
	
	protected void logError(String message) {
		throw new SiDLException(message);
	}
	
	protected void logError(String message, SiDLNode offendingNode) {
		throw new SiDLException("Line " + offendingNode.getLine() + ": " + message);
	}

}
