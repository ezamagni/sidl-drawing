package sidl.grammar.ast;

import org.antlr.runtime.Token;

import sidl.interpreter.visitors.SiDLVisitor;

public class IdNode extends SiDLNode {

	public IdNode(Token t) {
		super(t);
	}
	
	public String getName() {
		return getText();
	}

	@Override
	public void accept(SiDLVisitor siDLVisitor) {
		siDLVisitor.visit(this);
	}
	
}
