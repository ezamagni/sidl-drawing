package sidl.interpreter;

import java.util.ArrayList;

import sidl.grammar.ast.expressions.numeric.*;
import sidl.interpreter.visitors.NumExpVisitor;
import sidl.interpreter.visitors.ReferenceResolver;

public class NumExpEvaluator implements NumExpVisitor {
	protected float result;
	protected ReferenceResolver resolver;

	
	
	public NumExpEvaluator(ReferenceResolver resolver) {
		this.resolver = resolver;
	}
	
	public float getResult() {
		return result;
	}
	
	public void visit(ValueExp exp) {
		result = exp.getValue();
	}
	
	public void visit(PlusExp exp) {
		exp.getLeft().accept(this);
		float vleft = result;
		exp.getRight().accept(this);
		float vright = result;
		result = vleft + vright;
	}
	
	public void visit(MinusExp exp) {
		exp.getLeft().accept(this);
		float vleft = result;
		exp.getRight().accept(this);
		float vright = result;
		result = vleft - vright;
	}
	
	public void visit(MultExp exp) {
		exp.getLeft().accept(this);
		float vleft = result;
		exp.getRight().accept(this);
		float vright = result;
		result = vleft * vright;
	}
	
	public void visit(DivExp exp) {
		exp.getLeft().accept(this);
		float vleft = result;
		exp.getRight().accept(this);
		float vright = result;
		result = vleft / vright;
	}

	public void visit(VarExp varExp) {
		result = resolver.resolveVariable(varExp.getVarName());
	}

	public void visit(FunctionExp funcExp) {
		int paramcount = funcExp.getParameterCount();
		ArrayList<Float> params = new ArrayList<Float>(paramcount);
		
		// calcolo parametri
		for(int i = 0; i < paramcount; i++) {
			NumExp param = funcExp.getParameter(i);
			param.accept(this);
			params.add(this.result);
		}
		
		// chiamo funzione
		result = resolver.resolveFunction(funcExp.getCalledFunctionName(), params);

	}

	public void visit(NegExp exp) {
		exp.getNegatedExp().accept(this);
		result *= -1;
	}
}
