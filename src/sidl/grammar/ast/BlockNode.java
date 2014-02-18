package sidl.grammar.ast;

import sidl.interpreter.visitors.SiDLVisitor;

public class BlockNode extends SiDLNode {
	
	public BlockNode(int ttype) {
		super(ttype);
	}
	

	public int getStatementCount() {
		return getChildCount();
	}
	
	public StatementNode getStatement(int index) {
		return (StatementNode) getChild(index);
	}
	
	@Override
	public void accept(SiDLVisitor siDLVisitor) {
		siDLVisitor.visit(this);
	}
}
