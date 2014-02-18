package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.LogExpVisitor;

public class LEExp extends BinRelExp {
	
	public LEExp(Token t) {
		super(t);
	}
	
	@Override
	public String getOp() {
		return "<=";
	}
	
	@Override
	public void accept(LogExpVisitor v) {
		v.visit(this);
	}
	
}
