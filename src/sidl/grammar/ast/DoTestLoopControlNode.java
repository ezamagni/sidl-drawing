package sidl.grammar.ast;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.SiDLVisitor;

public class DoTestLoopControlNode extends LoopControlNode {
	
	public DoTestLoopControlNode(Token t) {
		super(t);
	}
	
	@Override
	public void accept(SiDLVisitor visitor) {
		visitor.visit(this);
	}
	
}
