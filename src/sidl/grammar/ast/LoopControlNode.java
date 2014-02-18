package sidl.grammar.ast;

import org.antlr.runtime.Token;
import sidl.grammar.ast.expressions.logic.LogExp;


public abstract class LoopControlNode extends ControlNode {
	
	public LoopControlNode(Token t) {
		super(t);
	}
	
	public LogExp getCondition() {
		return (LogExp) getChild(0);
	}
	
	public BlockNode getBlock() {
		return (BlockNode) getChild(1);
	}
	
}
