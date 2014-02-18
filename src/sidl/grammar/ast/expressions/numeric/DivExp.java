package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.NumExpVisitor;

public class DivExp extends BinOpExp {
	
	public DivExp(Token t) {
		super(t);
	}
	
	@Override
	public String getOp() {
		return "/";
	}

	@Override
	public void accept(NumExpVisitor v) {
		v.visit(this);
	}
}
