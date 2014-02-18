package sidl.gui;

import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import sidl.interpreter.domain.Line;

public class GUIController implements ActionListener, DocumentListener {
	
	private List<GUIListener> listeners;
	private WindowMain winmain;
	
	
	public GUIController() {
		listeners = new ArrayList<GUIListener>();
		
		// INIZIALIZZO WINDOWMAIN
		winmain = new WindowMain();		
		winmain.getBtnCompile().addActionListener(this);
		winmain.getTxtErrors().getDocument().addDocumentListener(this);
		winmain.setVisible(true);
		
		// redirigo System.out
		MessageConsole mcOut = new MessageConsole(winmain.getTxtOutput(), true);
		mcOut.redirectOut();
		// redirigo System.err
		MessageConsole mcErr = new MessageConsole(winmain.getTxtErrors(), true);
		mcErr.redirectErr();
	}
	
	public void addGUIListener(GUIListener listener) {
		listeners.add(listener);
	}
	
	public void removeGUIListener(GUIListener listener) {
		listeners.remove(listener);
	}
	
	public void drawLines(List<Line> lines) {
		winmain.getPnlDraw().setStrokes(lines);
		winmain.getDrawScrollPane().repaint();
		
		// stampo info output
		Dimension imgSize = winmain.getPnlDraw().getImgDimension();
		String outInfo = "" + lines.size() + " linee disegnate. L'output misura " 
				+ imgSize.width + " x " 
				+ imgSize.height + " pixels.";
		winmain.getLblOutput().setText(outInfo);	
	}
	
	public void printTrack(String text) {
		winmain.getTxtTrack().setText(text);
	}
	
	public void cleanOutput() {
		winmain.getTxtOutput().setText("");
	}
	
	public void cleanErrors() {
		winmain.getTxtErrors().setText("");
	}
	
	public void logError(String errmsg) {
		winmain.getTxtErrors().append("\n" + errmsg);
	}
	
	
	/*
	 * EVENTS
	 */
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		JComponent source = (JComponent) ae.getSource();
		if (source instanceof JButton) {
			// BUTTONS
			if (source == winmain.getBtnCompile()) {
				// compila
				cleanErrors();
				cleanOutput();
				String code = winmain.getTxtCode().getText();
				for (GUIListener l : listeners)
					l.userRequestCompilation(code, winmain.getChckbxTracking().isSelected());
			}
		}
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {	 }

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// ricevuti messaggi di errore: visualizzo textArea
		winmain.getTabbedPane().setSelectedComponent(winmain.getPanelErrors());
	}

	public void removeUpdate(DocumentEvent arg0) {	}
	
}
