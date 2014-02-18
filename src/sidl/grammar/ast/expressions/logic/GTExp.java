package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.LogExpVisitor;

public class GTExp extends BinRelExp {
	
	public GTExp(Token t) {
		super(t);
	}
	
	@Override
	public String getOp() {
		return ">";
	}
	
	@Override
	public void accept(LogExpVisitor v) {
		v.visit(this);
	}
	
}
