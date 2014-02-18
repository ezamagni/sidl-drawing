package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.NumExpVisitor;

public class ValueExp extends NumExp {
	protected float value;
	
	public ValueExp(Token t) {
		super(t);
		this.value = Float.parseFloat(t.getText());
	}
	
	public float getValue() {
		return value;
	}

	@Override
	public void accept(NumExpVisitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
		return "" + getValue();
	}
}
