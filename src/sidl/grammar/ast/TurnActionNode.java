package sidl.grammar.ast;

import org.antlr.runtime.Token;
import sidl.grammar.SiDLParser;
import sidl.grammar.ast.expressions.numeric.NumExp;
import sidl.interpreter.domain.Cursor;
import sidl.interpreter.visitors.SiDLVisitor;

public class TurnActionNode extends ActionNode {
	
	private Cursor.Direction direction;
	
	public TurnActionNode(int ttype, Token directiontoken) {
		super(ttype);
		
		// default direction
		this.direction = Cursor.Direction.RIGHT;
		
		if (directiontoken != null) {
			switch (directiontoken.getType()) {
			case SiDLParser.LEFT:
				this.direction = Cursor.Direction.LEFT;
				break;
			case SiDLParser.RIGHT:
				this.direction = Cursor.Direction.RIGHT;
				break;
			}
		}
	}

	public Cursor.Direction getDirection() {
		return this.direction;
	}
	
	public NumExp getAmountExpNode() {
		return (NumExp) getChild(0);
	}
	
	@Override
	public void accept(SiDLVisitor siDLVisitor) {
		siDLVisitor.visit(this);
	}
}
