package sidl.grammar.ast;

import org.antlr.runtime.Token;

import sidl.grammar.ast.expressions.logic.LogExp;
import sidl.interpreter.visitors.SiDLVisitor;

public class IfControlNode extends ControlNode {
	
	public IfControlNode(Token t) {
		super(t);
	}
	
	
	public int getConditionCount() {
		return getChildCount() / 2;
	}
	
	public LogExp getCondition(int index) {
		return (LogExp) getChild(index);
	}
	
	public BlockNode getThenBlock(int index) {
		return (BlockNode) getChild(getConditionCount() + index);
	}
	
	public boolean hasElseBlock() {
		return getChildCount() % 2 == 1;
	}
	
	public BlockNode getElseBlock() {
		return (BlockNode) getChild(getChildCount() - 1);
	}
	
	@Override
	public void accept(SiDLVisitor v) {
		v.visit(this);
	}
	
}
