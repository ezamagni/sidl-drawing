package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;

public abstract class BinLogExp extends LogExp {
	
	public BinLogExp(Token t) {
		super(t);
	}
	
	public LogExp getLeft() {
		return (LogExp) getChild(0);
	}
	
	public LogExp getRight() {
		return (LogExp) getChild(1);
	}
	
	@Override
	public String toString() {
		return getLeft().toString() + getOp() + getRight().toString();
	}
	
}
