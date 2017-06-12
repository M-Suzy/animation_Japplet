package Body;

public class Line2 {

	private Point start, end;
	
	public Line2(double startX, double startY, double endX, double endY) {
		start = new Point(startX, startY);
		end = new Point(endX, endY);
	}
	
	public Line2(Point startP, Point endP) {
		start = startP;
		end = endP;
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
		return end.getX();
	}

	public double endY() {
		return end.getY();
	}

	public int intEndX() {
		return end.intX();
	}

	public int intEndY() {
		return end.intY();
	}
	
	public double length() {
		return start.dist(end);
	}
	
	public double slope() {
		return start.dir(end);
	}
	
	public void shift(double dx, double dy) {
		start.shift(dx, dy);
		end.shift(dx, dy);
	}
	
	public void rotate(double da) {
		end.shift(start.getX() - end.getX() + length() * Math.cos(slope() + da),
				start.getY() - end.getY() + length() * Math.sin(slope() + da));
	}
}