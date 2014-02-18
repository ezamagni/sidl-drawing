package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.LogExpVisitor;

public class GEExp extends BinRelExp {
	
	public GEExp(Token t) {
		super(t);
	}
	
	@Override
	public String getOp() {
		return ">=";
	}
	
	@Override
	public void accept(LogExpVisitor v) {
		v.visit(this);
	}
	
}
