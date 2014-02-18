package sidl.grammar.ast;

import org.antlr.runtime.Token;
import sidl.grammar.SiDLParser;
import sidl.interpreter.domain.Cursor;
import sidl.interpreter.visitors.SiDLVisitor;

public class PenActionNode extends ActionNode {
	
	private Cursor.Action action;
	
	public PenActionNode(int ttype, Token actiontoken) {
		super(ttype);
		
		switch (actiontoken.getType()) {
		case SiDLParser.DROP:
			this.action = Cursor.Action.DROP;
			break;
		case SiDLParser.PULL:
			this.action = Cursor.Action.PULL;
			break;
		default:
			// error!
		}
	}
	
	public Cursor.Action getAction() {
		return this.action;
	}
	
	@Override
	public void accept(SiDLVisitor siDLVisitor) {
		siDLVisitor.visit(this);
	}
	
}
