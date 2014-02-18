package sidl.interpreter.visitors;

import sidl.grammar.ast.*;

/**
 * 
 * @author Enrico Zamagni
 */
public interface SiDLVisitor {
	
	// programma
	public void visit(ProgramNode program);			// nodo radice

	public void visit(ProcedureNode procedure); 		// procedura
	public void visit(FunctionNode functionNode);		// funzione
	public void visit(ProcedureCallNode callnode);		// chiamata a procedura
	public void visit(AssignmentNode assignment); 	// assegnamento
	public void visit(BlockNode block); 				// blocco istruzioni
	
	// istruzioni
	public void visit(PenActionNode action);
	public void visit(MoveActionNode action);
	public void visit(TurnActionNode action);
	
	// identificatore
	public void visit(IdNode idNode);

	// controllo
	public void visit(IfControlNode ifnode);
	public void visit(TestDoLoopControlNode testdoloop);
	public void visit(DoTestLoopControlNode dotestloop);
	public void visit(FromToControlNode ftnode);

}
