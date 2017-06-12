package Body;

public class Line1 {
	private Point start;
	private double len, angle;
	
	public Line1(double startX, double startY, double endX, double endY) {
		start = new Point(startX, startY);
		Point end = new Point(endX, endY);
		len = start.dist(end);
		angle = start.dir(end);
	}
	
	public Line1(Point startP, Point endP) {
		start = startP;
		len = start.dist(endP);
		angle = start.dir(endP);
	}
	
	public double getX() {
		return start.getX();
	}

	public double getY() {
		return start.getY();
	}

	public int intX() {
		return start.intX();
	}

	public int intY() {
		return start.intY();
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
	
	public void shift(double dx, double dy) {
		start.shift(dx, dy);
	}
	
	public void rotate(double da) {
		angle += da;
	}
}