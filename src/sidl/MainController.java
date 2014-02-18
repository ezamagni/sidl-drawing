package sidl;

import org.antlr.runtime.*;
import sidl.grammar.SiDLLexer;
import sidl.grammar.SiDLParser;
import sidl.grammar.ast.ProgramNode;
import sidl.gui.GUIController;
import sidl.gui.GUIListener;
import sidl.interpreter.LineSiDLInterpreter;
import sidl.interpreter.TrackSiDLInterpreter;
import sidl.interpreter.visitors.SiDLException;

public class MainController implements GUIListener {
	
	private GUIController guicontroller;
	private TrackSiDLInterpreter track_interpreter;
	private LineSiDLInterpreter line_interpreter;
	
	public MainController() {		
		// inizializzo interpreti
		track_interpreter = new TrackSiDLInterpreter();
		line_interpreter = new LineSiDLInterpreter();
		
		// inizializzo controller GUI
		guicontroller = new GUIController();
		guicontroller.addGUIListener(this);
		
	}
	
	/**
	 * Entry point.
	 */
	public static void main(String args[]) {
		new MainController();
	}

	@Override
	public void userRequestCompilation(String code, boolean isTrackingEnabled) {
		ProgramNode ast = null;
		
		// produco AST da input utente
		try {
			ast = parse(code);
		} catch (Exception e) {
			guicontroller.logError(e.getMessage());
			return;
		} finally {
			if(ast == null) return;
		}
		
		// interpreto AST
		try {
			line_interpreter.visit(ast);
			if(isTrackingEnabled) 
				track_interpreter.visit(ast);
		} catch(SiDLException e) {
			guicontroller.logError("Error: " + e.getMessage());
			return;
		} catch (Exception e) {
			guicontroller.logError("Unexpected error during interpretation: " + e.getMessage() + "\n");
			e.printStackTrace();
			return;
		} 
		
		// rendo output
		guicontroller.drawLines(line_interpreter.getStrokes());
		if(isTrackingEnabled)
			guicontroller.printTrack(track_interpreter.getOutput());
			
	}
	
	private ProgramNode parse(String code) throws Exception {
		// inizializzo parser ANTLR
		CharStream charstream = new ANTLRStringStream(code);
		Lexer lexer = new SiDLLexer(charstream);
		TokenStream tokens = new CommonTokenStream(lexer);
		SiDLParser parser = new SiDLParser(tokens);
		
		// processo codice in input
		SiDLParser.program_return parserres = parser.program();
		
		// verifico presenza di errori
		int errnum = parser.getNumberOfSyntaxErrors();
		if(errnum > 0) {
			guicontroller.logError("" + errnum + " errors parsing input. Execution interrupted.");
			return null;
		}
		
		// ottengo AST
		Object astoutput = parserres.getTree();
		if(astoutput == null) {
			throw new Exception("Parser returned no result");
		}
		if(!(astoutput instanceof ProgramNode)) {
			throw new Exception("Parser returned unexpected AST");
		}
		
		return (ProgramNode) astoutput;
	}

}