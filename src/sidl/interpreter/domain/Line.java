package sidl.interpreter.domain;

public class Line {
	
	public int x1, y1;
	public int x2, y2;
	
	public Line() {
		x1 = x2 = y1 = y2 = 0;
	}
	
	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Line(Line l) {
		this.x1 = l.x1;
		this.y1 = l.y1;
		this.x2 = l.x2;
		this.y2 = l.y2;	
	}
}
