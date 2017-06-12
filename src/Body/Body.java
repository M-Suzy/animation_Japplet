package Body;
import java.awt.Graphics;

public class Body {
	
	private Line0 armL, legL;
	private Line1 armR, legR;
	private Line2 torso;
	
	public Body(double neckX, double neckY, double length) 	{
		armL  = new Line0(neckX, neckY, neckX - length, neckY);
		armR  = new Line1((Point) armL,  new Point(neckX + length, neckY));
		legL  = new Line0(neckX, neckY + length, neckX, neckY + 2 * length);
		legR  = new Line1((Point) legL,  new Point(legL.endX(), legL.endY()));
		torso = new Line2((Point) legL, (Point) armL);
	}
	
	public void shift(double dx, double dy)	{
		torso.shift(dx, dy);
	}
	
	public void move() {
		torso.rotate(Math.random() * 0.2 - 0.1);
		legL.rotate(Math.random() * 0.2 - 0.1);
		legR.rotate(Math.random() * 0.2 - 0.1);
		armL.rotate(Math.random() * 0.2 - 0.1);
		armR.rotate(Math.random() * 0.2 - 0.1);
	}
	
	public void draw(Graphics g) {
		g.drawLine(torso.intX(), torso.intY(), torso.intEndX(), torso.intEndY());
		g.drawLine(legL.intX(), legL.intY(), legL.intEndX(), legL.intEndY());
		g.drawLine(legR.intX(), legR.intY(), legR.intEndX(), legR.intEndY());
		g.drawLine(armL.intX(), armL.intY(), armL.intEndX(), armL.intEndY());
		g.drawLine(armR.intX(), armR.intY(), armR.intEndX(), armR.intEndY());
	}
}