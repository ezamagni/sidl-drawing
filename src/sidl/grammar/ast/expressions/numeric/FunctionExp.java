package sidl.grammar.ast.expressions.numeric;

import org.antlr.runtime.Token;
import sidl.interpreter.visitors.NumExpVisitor;

public class FunctionExp extends NumExp {
	
	public FunctionExp(Token t) {
		super(t);
	}
	
	
	public String getCalledFunctionName() {
		return getText();
	}
	
	public int getParameterCount() {
		return getChildCount();
	}
	
	public NumExp getParameter(int index) {
		return (NumExp) getChild(index);
	}
	
	@Override
	public void accept(NumExpVisitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
		String strParams = "";
		for(int i = 0; i < getParameterCount(); i++, strParams += ", ") {
			strParams += getParameter(i).toString();
		}
		return getCalledFunctionName() + "(" + strParams + ")";
	}
	
}
