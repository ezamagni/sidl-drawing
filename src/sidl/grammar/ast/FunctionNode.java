package sidl.grammar.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import sidl.grammar.ast.expressions.numeric.NumExp;
import sidl.interpreter.visitors.SiDLVisitor;

public class FunctionNode extends SiDLNode {
	
	private BlockNode block = null;
	private int paramcount = 0;
	
	public FunctionNode(Token t) {
		super(t);
	}
	
	public String getName() {
		return getText();
	}
	
	public BlockNode getBlock() {
		return block;
	}
	
	public NumExp getReturnExpr() {
		return (NumExp) getChild(getChildCount() - 1);
	}
	
	public int getParameterCount() {
		return paramcount;
	}
	
	public IdNode getParameter(int index) {
		return (IdNode) getChild(index);
	}
	
	@Override
	public void addChild(Tree child) {
		super.addChild(child);
		
		if(child instanceof BlockNode) {
			// corpo della funzione
			block = (BlockNode) child;
		} else if(child instanceof IdNode) {
			// singolo parametro
			paramcount++;
		} else {
			// lista di parametri
			for(int i = 0; i < child.getChildCount(); i++) {
				if(child.getChild(i) instanceof IdNode) {
					paramcount++;
				}
			}
		}
	}
	
	@Override
	public void accept(SiDLVisitor visitor) {
		visitor.visit(this);
	}
	
}
