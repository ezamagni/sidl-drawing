package sidl.grammar.ast;

import org.antlr.runtime.Token;


public abstract class ControlNode extends StatementNode {
	
	public ControlNode(Token t) {
		super(t);
	}
	
	public ControlNode(int ttype) {
		super(ttype);
	}
	
}
