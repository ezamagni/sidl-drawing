package sidl.interpreter.domain;

import java.util.HashMap;
import java.util.Map.Entry;

public class Environment implements Cloneable {

	protected HashMap<String, Float> env;
	
	public Environment() {
		this.env = new HashMap<String, Float>();
	}
	
	public HashMap<String, Float> getHashMap() {
		return this.env;
	}
	
	public Float getVar(String varName) {
		return env.get(varName);
	}
	
	public void putVar(String varName, float varValue) {
		env.put(varName, varValue);
	}
	
	public Environment clone() {
		Environment clone = new Environment();
		for( Entry<String, Float> e : this.env.entrySet()) {
			clone.putVar(e.getKey(), e.getValue());
		}
		return clone;
	}
	
	public String toString() {
		String result = "{ ";
		for (Entry<String, Float> e : env.entrySet()) {
			result += e.getKey() + " = " + e.getValue() + ", ";
		}
		result += "}";
		return result;
	}
}
