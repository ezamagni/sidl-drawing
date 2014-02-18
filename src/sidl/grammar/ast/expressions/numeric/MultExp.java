package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.NumExpVisitor;

public class MultExp extends BinOpExp {
	
	public MultExp(Token t) {
		super(t);
	}
	
	@Override
	public String getOp() {
		return "*";
	}

	@Override
	public void accept(NumExpVisitor v) {
		v.visit(this);
	}
}
