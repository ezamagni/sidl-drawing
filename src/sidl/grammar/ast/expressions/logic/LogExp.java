package sidl.grammar.ast.expressions.logic;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import sidl.interpreter.visitors.LogExpVisitor;

public abstract class LogExp extends CommonTree {
	
	public LogExp(Token t) {
		super(t);
	}
	
	public abstract String toString();
	
	public abstract String getOp();

	public abstract void accept(LogExpVisitor v);	
}
