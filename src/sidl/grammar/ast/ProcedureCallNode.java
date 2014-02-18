package sidl.grammar.ast;

import org.antlr.runtime.Token;

import sidl.grammar.ast.expressions.numeric.NumExp;
import sidl.interpreter.visitors.SiDLVisitor;

public class ProcedureCallNode extends StatementNode {
	
	public ProcedureCallNode(Token t) {
		super(t);
	}
	
	
	public String getCalledProcedureName() {
		return getText();
	}
	
	public int getParameterCount() {
		return getChildCount();
	}
	
	public NumExp getParameter(int index) {
		return (NumExp) getChild(index);
	}
	
	@Override
	public void accept(SiDLVisitor visitor) {
		visitor.visit(this);
	}
	
}
