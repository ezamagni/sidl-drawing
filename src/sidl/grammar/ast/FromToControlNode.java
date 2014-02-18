package sidl.grammar.ast;

import org.antlr.runtime.Token;

import sidl.grammar.ast.expressions.numeric.NumExp;
import sidl.interpreter.visitors.SiDLVisitor;

public class FromToControlNode extends ControlNode {
	
	public FromToControlNode(Token t) {
		super(t);
	}
	
	public boolean hasIndexVar() {
		return getChildCount() > 3;
	}
	
	public IdNode getIndexVar() {
		if(hasIndexVar())
			return (IdNode) getChild(2);
		else
			return null;
	}
	
	public NumExp getStartExpr() {
		return (NumExp) getChild(0);
	}
	
	public NumExp getEndExpr() {
		return (NumExp) getChild(1);
	}
	
	public BlockNode getBlock() {
		return (BlockNode) getChild(getChildCount() - 1);
	}
	
	@Override
	public void accept(SiDLVisitor visitor) {
		visitor.visit(this);
	}
	
}
