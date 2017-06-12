package Body;

public class Line0 extends Point {

	private double len, angle;

	public Line0(double startX, double startY, double endX, double endY) {
		super(startX, startY);
		Point end = new Point(endX, endY);
		len = dist(end);
		angle = dir(end);
	}

	public Line0(Point startP, Point endP) {
		super(startP);
		len = dist(endP);
		angle = dir(endP);
	}

	public double endX() {
		return getX() + len * Math.cos(angle);
	}

	public double endY() {
		return getY() + len * Math.sin(angle);
	}

	public int intEndX() {
		return (int)(endX() + 0.5);
	}

	public int intEndY() {
		return (int)(endY() + 0.5);
	}

	public double length() {
		return len;
	}
	
	public double slope() {
		return angle;
	}

	public void rotate(double da) {
		angle += da;
	}
}

