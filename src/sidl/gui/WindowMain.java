package sidl.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.Cursor;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;

public class WindowMain extends JFrame {
	private JButton btnCompile;
	private DrawPanel pnlDraw;
	private JTextArea txtCode;
	private JScrollPane scrollPane;
	private JTextArea txtOutput;
	private JTextArea txtErrors;
	private JTabbedPane tabbedPane;
	private JPanel panelErrors;
	private JTextArea txtTrack;
	private JLabel lblOutput;
	private JCheckBox chckbxTracking;

	
	public WindowMain() {
		super();
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("SiDL GUI Interpreter");
		setBounds(100, 100, 512, 760);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setAutoscrolls(true);
		splitPane.setDividerSize(8);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane);
		
		scrollPane = new JScrollPane();
		scrollPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBackground(UIManager.getColor("InternalFrame.background"));
		scrollPane.setPreferredSize(new Dimension(400, 400));
		splitPane.setLeftComponent(scrollPane);
		
		pnlDraw = new DrawPanel();
		FlowLayout flowLayout = (FlowLayout) pnlDraw.getLayout();
		flowLayout.setAlignOnBaseline(true);
		scrollPane.setViewportView(pnlDraw);
		pnlDraw.setBackground(Color.WHITE);
		pnlDraw.setForeground(Color.BLACK);
		pnlDraw.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		splitPane.setRightComponent(tabbedPane);
		
		JPanel panelCode = new JPanel();
		tabbedPane.addTab("Codice", null, panelCode, null);
		panelCode.setLayout(new BorderLayout(0, 4));
		
		Box horizontalBox = Box.createHorizontalBox();
		panelCode.add(horizontalBox, BorderLayout.SOUTH);
		
		btnCompile = new JButton("Esegui");
		btnCompile.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnCompile.setIcon(new ImageIcon(WindowMain.class.getResource("/sidl/gui/icons/execute.png")));
		btnCompile.setMnemonic('c');
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		chckbxTracking = new JCheckBox("Abilita tracking");
		horizontalBox.add(chckbxTracking);
		btnCompile.setAlignmentX(Component.RIGHT_ALIGNMENT);
		horizontalBox.add(btnCompile);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelCode.add(scrollPane_1, BorderLayout.CENTER);
		
		txtCode = new JTextArea();
		scrollPane_1.setViewportView(txtCode);
		txtCode.setTabSize(4);
		
		JPanel panelOutput = new JPanel();
		tabbedPane.addTab("Output", null, panelOutput, null);
		panelOutput.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelOutput.add(scrollPane_2);
		
		txtOutput = new JTextArea();
		txtOutput.setEditable(false);
		scrollPane_2.setViewportView(txtOutput);
		
		lblOutput = new JLabel("No output");
		panelOutput.add(lblOutput, BorderLayout.SOUTH);
		
		JScrollPane panelTrack = new JScrollPane();
		tabbedPane.addTab("Tracker", null, panelTrack, null);
		
		txtTrack = new JTextArea();
		panelTrack.setViewportView(txtTrack);
		
		panelErrors = new JPanel();
		tabbedPane.addTab("Errori", null, panelErrors, null);
		panelErrors.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelErrors.add(scrollPane_3, BorderLayout.CENTER);
		
		txtErrors = new JTextArea();
		txtErrors.setForeground(Color.RED);
		txtErrors.setEditable(false);
		scrollPane_3.setViewportView(txtErrors);
	}
	
	public JButton getBtnCompile() {
		return btnCompile;
	}
	public JTextArea getTxtCode() {
		return txtCode;
	}
	public DrawPanel getPnlDraw() {
		return pnlDraw;
	}
	public JScrollPane getDrawScrollPane() {
		return scrollPane;
	}
	public JTextArea getTxtOutput() {
		return txtOutput;
	}
	public JTextArea getTxtErrors() {
		return txtErrors;
	}
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}
	public JPanel getPanelErrors() {
		return panelErrors;
	}
	public JTextArea getTxtTrack() {
		return txtTrack;
	}
	public JLabel getLblOutput() {
		return lblOutput;
	}
	public JCheckBox getChckbxTracking() {
		return chckbxTracking;
	}
}
