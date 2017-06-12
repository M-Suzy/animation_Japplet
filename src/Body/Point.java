package Body;
public class Point {

	private double x, y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(double newX, double newY) {
		x = newX;
		y = newY;
	}

	public Point(Point that) {
		x = that.x;
		y = that.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public int intX() {
		return (int)(x + 0.5);
	}

	public int intY() {
		return (int)(y + 0.5);
	}
	
	public void shift(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double dist(Point that) {
		return Math.sqrt((x - that.x) * (x - that.x) + (y - that.y) * (y - that.y));
	}
	
	public double dir(Point that) {
		return Math.atan2(that.y - y, that.x - x);
	}
}