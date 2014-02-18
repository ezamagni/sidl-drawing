package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;

public abstract class BinOpExp extends NumExp {
	
	public BinOpExp(Token t) {
		super(t);
	}
	
	public abstract String getOp();
	
	public NumExp getLeft() {
		return (NumExp) getChild(0);
	}

	public NumExp getRight() {
		return (NumExp) getChild(1);
	}

	public String toString() {
		return getLeft().toString() + getOp() + getRight().toString();
	}
}
