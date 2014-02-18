package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.NumExpVisitor;

public class NegExp extends NumExp {
	
	public NegExp(Token t) {
		super(t);
	}
	
	public NumExp getNegatedExp() {
		return (NumExp) getChild(0);
	}
	
	@Override
	public void accept(NumExpVisitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
		return "-" + getNegatedExp().toString();
	}
	
}
