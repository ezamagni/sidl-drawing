package sidl.grammar.ast;

import java.util.ArrayList;
import org.antlr.runtime.tree.Tree;

import sidl.grammar.SiDLParser;
import sidl.interpreter.visitors.SiDLVisitor;

public class ProgramNode extends SiDLNode {
	
	protected ProcedureNode mainProcedure;
	protected ArrayList<ProcedureNode> procedures;
	protected ArrayList<FunctionNode> functions;
	
	public ProgramNode(int ttype) {
		super(ttype);
		
		this.procedures = new ArrayList<ProcedureNode>();
		this.functions = new ArrayList<FunctionNode>();
	}
	
	public ProcedureNode getMainProcedure() {
		return mainProcedure;
	}
	
	public ProcedureNode getProcedure(String name) {
		for( ProcedureNode p : procedures) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		
		return null;
	}
	
	public FunctionNode getFunction(String name) {
		for(FunctionNode f : functions) {
			if(f.getName().equals(name)) {
				return f;
			}
		}
		
		return null;
	}
	
	
	@Override
	public void addChild(Tree child) {
		super.addChild(child);
		
		if(child instanceof ProcedureNode) {
			ProcedureNode procedure = (ProcedureNode) child;
			if(procedure.getType() == SiDLParser.BEGIN) {
				this.mainProcedure = procedure;
			} else {
				procedures.add(procedure);
			}
		} else if(child instanceof FunctionNode) {
			FunctionNode function = (FunctionNode) child;
			functions.add(function);
		}
	}
	
	@Override
	public void accept(SiDLVisitor siDLVisitor) {
		siDLVisitor.visit(this);
	}
}
