package sidl.interpreter.visitors;

import sidl.grammar.ast.expressions.logic.*;

public interface LogExpVisitor {

	public void visit(AndExp andExp);
	public void visit(OrExp orExp);
	public void visit(XorExp xorExp);
	public void visit(LTExp ltExp);
	public void visit(LEExp leExp);
	public void visit(ETExp etExp);
	public void visit(DFExp dfExp);
	public void visit(GEExp geExp);
	public void visit(GTExp gtExp);
	public void visit(NotExp notExp);
	
}
