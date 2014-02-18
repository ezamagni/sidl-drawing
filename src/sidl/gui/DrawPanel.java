package sidl.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import sidl.interpreter.domain.Line;

public class DrawPanel extends JPanel {
	
	protected List<Line> strokes;
	protected BufferedImage image;
	
	private int xmin, xmax, ymin, ymax;
	
	public DrawPanel() {
		super();
		setAutoscrolls(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);

		g.drawImage(image, 0, 0, null);
	}
	
	public void setStrokes(List<Line> strokes) {
		if(strokes == null) return;
		
		// determino dimensioni immagine
		Dimension imgSize = computeImageDimensions(strokes);		
		
		// converto da coordinate cartesiane a coordinate viewport
		strokes = worldToViewport(strokes);
		
		// set-up immagine
		image = new BufferedImage(imgSize.width, imgSize.height,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D) image.getGraphics();
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                    RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(getBackground());
		g.fillRect(0, 0, imgSize.width, imgSize.height);
		g.setColor(getForeground());
		
		// disegno linee
		for(Line l : strokes) {
			g.drawLine(l.x1, l.y1, l.x2, l.y2);
			System.out.println("(" + l.x1 + ":" + l.y1 + ") (" + l.x2 + ":" + l.y2 + ")");
		}
		
		setPreferredSize(imgSize);
		
		// Flip the image horizontally
		AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
		tx.translate(0, -image.getHeight(null));
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		image = op.filter(image, null);
			
		// repaint component
		this.revalidate();
	}
	
	private Dimension computeImageDimensions(List<Line> strokes) {
		if(strokes.size() == 0) return new Dimension(1, 1);
		
		xmin = ymin = Integer.MAX_VALUE;
		xmax = ymax = Integer.MIN_VALUE;
		
		for (Line l : strokes) {
			if (l.x1 < xmin)
				xmin = l.x1;
			if (l.x1 > xmax)
				xmax = l.x1;
			if (l.x2 < xmin)
				xmin = l.x2;
			if (l.x2 > xmax)
				xmax = l.x2;
			if (l.y1 < ymin)
				ymin = l.y1;
			if (l.y1 > ymax)
				ymax = l.y1;
			if (l.y2 < ymin)
				ymin = l.y2;
			if (l.y2 > ymax)
				ymax = l.y2;
		}
		
		return new Dimension(xmax - xmin + 1, ymax - ymin + 1);
	}
	
	private List<Line> worldToViewport(List<Line> strokes) {
		List<Line> vpstrokes = new ArrayList<Line>(strokes.size());
		
		for (Line l1 : strokes) {
			Line l2 = new Line(l1);
			l2.x1 = l1.x1 - xmin;
			l2.x2 = l1.x2 - xmin;
			l2.y1 = l1.y1 - ymin;
			l2.y2 = l1.y2 - ymin;
			vpstrokes.add(l2);
		}
		
		return vpstrokes;
	}
	
	public Dimension getImgDimension() {
		if(image == null) {
			return new Dimension(0, 0);
		}
		return new Dimension(image.getWidth(), image.getHeight());
	}
	
}
