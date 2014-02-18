package sidl.interpreter.visitors;

import sidl.grammar.ast.expressions.numeric.*;

public interface NumExpVisitor {
	
	public void visit(ValueExp exp);
	public void visit(PlusExp exp);
	public void visit(MinusExp exp);
	public void visit(MultExp exp);
	public void visit(DivExp exp);
	public void visit(VarExp varExp);
	public void visit(FunctionExp funcExp);
	public void visit(NegExp negExp);
}
