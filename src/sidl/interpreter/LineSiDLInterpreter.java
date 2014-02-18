package sidl.interpreter;

import java.util.ArrayList;
import java.util.List;
import sidl.grammar.ast.MoveActionNode;
import sidl.grammar.ast.ProgramNode;
import sidl.interpreter.domain.Cursor;
import sidl.interpreter.domain.Line;

/**
 * 
 * @author Enrico Zamagni
 */

public class LineSiDLInterpreter extends SiDLInterpreter {
	
	private ArrayList<Line> strokes;
	private ArrayList<Line> hiddenstrokes;
	
	
	@Override
	public void visit(ProgramNode program) {
		strokes = new ArrayList<Line>();
		hiddenstrokes = new ArrayList<Line>();
		super.visit(program);
	}
	
	@Override
	public void visit(MoveActionNode instr) {
		// salva stato del cursore
		Cursor prevCursor = super.cursor.clone();
		super.visit(instr);
		
		if(prevCursor.getX() == cursor.getX() && 
				prevCursor.getY() == cursor.getY())
			return;
		// costruisci linea
		Line line = new Line((int)prevCursor.getX(), (int)prevCursor.getY(), 
				(int)cursor.getX(), (int)cursor.getY());
		
		if(cursor.isPenDown()) {
			strokes.add(line);
		} else {
			hiddenstrokes.add(line);
		}
	}
	
	public List<Line> getStrokes() {
		return strokes;
	}
	
	public List<Line> getHiddenStrokes() {
		return hiddenstrokes;
	}
	
}
