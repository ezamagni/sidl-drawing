package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.LogExpVisitor;

public class NotExp extends LogExp {
	
	public NotExp(Token t) {
		super(t);
	}
	
	public LogExp getLogExp() {
		return (LogExp) getChild(0);
	}
	
	@Override
	public String toString() {
		return getOp() + getLogExp();
	}
	
	@Override
	public String getOp() {
		return "!";
	}
	
	@Override
	public void accept(LogExpVisitor v) {
		v.visit(this);
	}
	
}
