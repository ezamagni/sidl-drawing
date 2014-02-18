package sidl.interpreter.domain;

/**
 * 
 * @author Enrico Zamagni
 */

public class Cursor implements Cloneable {
	
	public enum Action {
		DROP, PULL
	}
	
	public enum Direction {
		LEFT, RIGHT, FORWARD, BACKWARD;
		
		public String toString() {
			switch (this) {
			case BACKWARD:
				return "backward";
			case FORWARD:
				return "forward";
			case LEFT:
				return "left";
			case RIGHT:
				return "right";
			default:
				return "";
			}
		}
	}
	
	protected float x, y;
	protected boolean pendown;
	protected float orientation;	// in degrees
	

	public Cursor() {
		x = y = 0;
		orientation = 0;
		pendown = true;
	}
	
	
	public void pull() {
		this.pendown = false;
	}
	
	public void drop() {
		this.pendown = true;
	}
	
	public void turn(Direction dir, float angle) {
		if(dir == Direction.RIGHT) {
			orientation += angle;
		} else if(dir == Direction.LEFT) {
			orientation -= angle;
		}
	}
	
	public void move(Direction dir, float amount) {
		double orientation = Math.toRadians(this.orientation);
		
		switch(dir) {
		case FORWARD:
			this.x += Math.sin(orientation) * amount;
			this.y += Math.cos(orientation) * amount;
			break;
		case BACKWARD:
			this.x -= Math.sin(orientation)  * amount;
			this.y -= Math.cos(orientation) * amount;
			break;
		case LEFT:
			this.x -= Math.cos(orientation)  * amount;
			this.y += Math.sin(orientation) * amount;
			break;
		case RIGHT:
			this.x += Math.cos(orientation)  * amount;
			this.y -= Math.sin(orientation) * amount;
			break;
		}
	}
	
	public boolean isPenDown() {
		return this.pendown;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}

	public float getOrientationRad() {
		return (float) Math.toDegrees(orientation);
	}
	
	public float getOrientation() {
		return orientation;
	}
	
	public void setOrientation(float orientation) {
		this.orientation = orientation;
	}
	
	public Cursor clone() {
		Cursor clone = null;
		try {
			clone = (Cursor) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
}
