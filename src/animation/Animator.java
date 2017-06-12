package animation;

import javax.swing.JApplet;
import java.awt.*;

public class Animator extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lag = 6;
	
	public void setLag(int powOf10) {
		lag = powOf10;
	}
	
	public int getLag() {
		return lag;
	}
	
	public boolean tick() {
		return true;
	}
	
	public void snapshot(Graphics g) {
		
	}
	
	public void delay() {
		for (int i = 0; i < Math.pow(10, lag); i++);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		snapshot(g);
		if (tick()) {
			delay();
			repaint();
		}
	}
}