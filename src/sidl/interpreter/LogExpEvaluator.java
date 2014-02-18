package sidl.interpreter;


import sidl.grammar.ast.expressions.logic.*;
import sidl.interpreter.visitors.LogExpVisitor;

public class LogExpEvaluator implements LogExpVisitor {
	protected boolean result = false;
	protected NumExpEvaluator numexpevaluator;

	
	public LogExpEvaluator(NumExpEvaluator eval) {
		this.numexpevaluator = eval;
	}
	
	public void setNumExpEvaluator(NumExpEvaluator eval) {
		this.numexpevaluator = eval;
	}
	
	public boolean getResult() {
		return this.result;
	}
	
	
	@Override
	public void visit(NotExp exp) {
		exp.getLogExp().accept(this);
		result = !result;
	}
	
	@Override
	public void visit(AndExp exp) {
		exp.getLeft().accept(this);
		boolean vleft = result;
		exp.getRight().accept(this);
		boolean vright = result;
		result = vleft && vright;
	}
	
	@Override
	public void visit(OrExp exp) {
		exp.getLeft().accept(this);
		boolean vleft = result;
		exp.getRight().accept(this);
		boolean vright = result;
		result = vleft || vright;
	}
	
	@Override
	public void visit(XorExp exp) {
		exp.getLeft().accept(this);
		boolean vleft = result;
		exp.getRight().accept(this);
		boolean vright = result;
		result = vleft ^ vright;
	}
	
	@Override
	public void visit(LTExp exp) {
		exp.getLeft().accept(numexpevaluator);
		float vleft = numexpevaluator.getResult();
		exp.getRight().accept(numexpevaluator);
		float vright = numexpevaluator.getResult();
		result = vleft < vright;
	}
	
	@Override
	public void visit(LEExp exp) {
		exp.getLeft().accept(numexpevaluator);
		float vleft = numexpevaluator.getResult();
		exp.getRight().accept(numexpevaluator);
		float vright = numexpevaluator.getResult();
		result = vleft <= vright;
	}
	
	@Override
	public void visit(ETExp exp) {
		exp.getLeft().accept(numexpevaluator);
		float vleft = numexpevaluator.getResult();
		exp.getRight().accept(numexpevaluator);
		float vright = numexpevaluator.getResult();
		result = vleft == vright;
	}
	
	@Override
	public void visit(DFExp exp) {
		exp.getLeft().accept(numexpevaluator);
		float vleft = numexpevaluator.getResult();
		exp.getRight().accept(numexpevaluator);
		float vright = numexpevaluator.getResult();
		result = vleft != vright;
	}
	
	@Override
	public void visit(GEExp exp) {
		exp.getLeft().accept(numexpevaluator);
		float vleft = numexpevaluator.getResult();
		exp.getRight().accept(numexpevaluator);
		float vright = numexpevaluator.getResult();
		result = vleft >= vright;
	}
	
	@Override
	public void visit(GTExp exp) {
		exp.getLeft().accept(numexpevaluator);
		float vleft = numexpevaluator.getResult();
		exp.getRight().accept(numexpevaluator);
		float vright = numexpevaluator.getResult();
		result = vleft > vright;
	}
	
}
