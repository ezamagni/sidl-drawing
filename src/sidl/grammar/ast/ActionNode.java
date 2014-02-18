package sidl.grammar.ast;

import org.antlr.runtime.Token;

public abstract class ActionNode extends StatementNode {
	
	public ActionNode(Token t) {
		super(t);
	}
	
	public ActionNode(int ttype) {
		super(ttype);
	}
}
