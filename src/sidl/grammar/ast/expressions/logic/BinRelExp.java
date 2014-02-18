package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;
import sidl.grammar.ast.expressions.numeric.NumExp;

public abstract class BinRelExp extends LogExp {
	
	public BinRelExp(Token t) {
		super(t);
	}
	
	public NumExp getLeft() {
		return (NumExp) getChild(0);
	}
	
	public NumExp getRight() {
		return (NumExp) getChild(1);
	}
	
	@Override
	public String toString() {
		return getLeft().toString() + getOp() + getRight().toString();
	}
	
}
