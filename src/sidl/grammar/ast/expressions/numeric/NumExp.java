package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import sidl.interpreter.visitors.NumExpVisitor;

public abstract class NumExp extends CommonTree {
	
	public NumExp(Token t) {
		super(t);
	}
	
	public abstract String toString();
	
	public abstract void accept(NumExpVisitor v);
}
