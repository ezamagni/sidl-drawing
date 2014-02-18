package sidl.grammar.ast;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.SiDLVisitor;

public class TestDoLoopControlNode extends LoopControlNode {
	
	public TestDoLoopControlNode(Token t) {
		super(t);
	}
	
	@Override
	public void accept(SiDLVisitor visitor) {
		visitor.visit(this);
	}
	
}
