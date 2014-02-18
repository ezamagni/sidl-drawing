package sidl.grammar.ast;

import org.antlr.runtime.Token;
import sidl.grammar.SiDLParser;
import sidl.interpreter.visitors.SiDLVisitor;


public class ProcedureNode extends SiDLNode {
	
	public ProcedureNode(Token t) {
		super(t);
	}
	
	public boolean isMainProcedure() {
		return getToken().getType() == SiDLParser.BEGIN;
	}
	
	public String getName() {
		return getText();
	}
	
	public BlockNode getBlock() {
		return (BlockNode) getChild(getChildCount() - 1);
	}
	
	public int getParameterCount() {
		return getChildCount() - 1;
	}
	
	public IdNode getParameter(int index) {
		return (IdNode) getChild(index);
	}
	
	@Override
	public void accept(SiDLVisitor visitor) {
		visitor.visit(this);
	}
}
