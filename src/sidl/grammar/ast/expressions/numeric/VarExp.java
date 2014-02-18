package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.NumExpVisitor;

public class VarExp extends NumExp {
	
	public VarExp(Token t) {
		super(t);
	}
	
	public String getVarName() {
		return getText();
	}
	
	@Override
	public void accept(NumExpVisitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
		return getVarName();
	}
}
