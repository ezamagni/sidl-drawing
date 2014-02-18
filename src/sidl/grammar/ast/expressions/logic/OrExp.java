package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.LogExpVisitor;

public class OrExp extends BinLogExp {
	
	public OrExp(Token t) {
		super(t);
	}
	
	@Override
	public String getOp() {
		return "|";
	}
	
	@Override
	public void accept(LogExpVisitor v) {
		v.visit(this);
	}
}
