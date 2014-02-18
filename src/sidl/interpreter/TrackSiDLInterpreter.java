package sidl.interpreter;

import sidl.grammar.ast.*;
import sidl.interpreter.domain.Cursor;

/**
 * 
 * @author Enrico Zamagni
 */

public class TrackSiDLInterpreter extends SiDLInterpreter {
	
	protected StringBuilder output;
	private static final int INITIAL_CAPACITY = 1024;
	
	public TrackSiDLInterpreter() {
		super();
	}
	
	public String getOutput() {
		return this.output.toString();
	}
	
	@Override
	public void visit(ProgramNode program) {
		output = new StringBuilder(INITIAL_CAPACITY);
		log("--- EXECUTION STARTED ---");
		
		super.visit(program);
		
		// programma terminato
		log("--- EXECUTION TERMINATED ---");
		log("Cursor at x:" + cursor.getX() + " y:"
				+ cursor.getY());
		log("Cursor orientation = "
				+ cursor.getOrientation());
	}
	
	/*
	 * TRACKING CURSOR
	 */
	@Override
	public void visit(PenActionNode instr) {
		super.visit(instr);
		
		if (instr.getAction() == Cursor.Action.DROP) {
			// appoggia penna
			log("[Cursor] \t Dropped pen");
		} else {
			// solleva penna
			log("[Cursor] \t Pulled pen");
		}
	}
	
	@Override
	public void visit(MoveActionNode instr) {
		Cursor.Direction dir = instr.getDirection();
		
		super.visit(instr);
		
		float amount = numexpeval.getResult();
		log("[Cursor] \t Moved " + dir.toString() + " by " + amount);
	}
	
	@Override
	public void visit(TurnActionNode instr) {
		Cursor.Direction dir = instr.getDirection();
		
		super.visit(instr);
		
		float amount = numexpeval.getResult();
		log("[Cursor] \t Turned " + dir.toString() + " by " + amount);
	}
	
	/*
	 * TRACKING CONTEXT
	 */
	
	@Override
	public void visit(ProcedureNode procedure) {
		log("[Context] \t Entering procedure \"" + procedure.getName() + "\""
				+ " passing parameters: " + params.toString());
		
		super.visit(procedure);
		
		log("[Context] \t Leaving procedure \"" + procedure.getName() + "\""
				+ " with environment: " + envPrevious.toString());
	};
	
	@Override
	public void visit(FunctionNode function) {
		log("[Context] \t Entering function \"" + function.getName() + "\""
				+ " passing parameters: " + params.toString());
		
		super.visit(function);
		
		log("[Context] \t Leaving function \"" + function.getName() + "\""
				+ " with environment: " + envPrevious.toString());
	}
	
	protected void log(String message) {
		output.append(message + "\n");
	}
	
}