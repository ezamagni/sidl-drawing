package sidl.grammar.ast;

import org.antlr.runtime.Token;
import sidl.grammar.ast.expressions.numeric.NumExp;
import sidl.interpreter.visitors.SiDLVisitor;


public class AssignmentNode extends StatementNode {
	
	public AssignmentNode(Token t) {
		super(t);
	}
	
	
	public int getVarCount() {
		return getChildCount() - 1;
	}

	public IdNode getVar(int index) {
		return  (IdNode) getChild(index);
	}
	
	public NumExp getExprNode() {
		return (NumExp) getChild(getChildCount() - 1);
	}
	
	@Override
	public void accept(SiDLVisitor siDLVisitor) {
		siDLVisitor.visit(this);
	}
}
