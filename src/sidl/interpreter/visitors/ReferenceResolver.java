package sidl.interpreter.visitors;

import java.util.List;

public interface ReferenceResolver {
	public float resolveVariable(String varName);
	public float resolveFunction(String funcName, List<Float> params);
}
