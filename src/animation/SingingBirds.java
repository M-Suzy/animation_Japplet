package animation;

import java.awt.Graphics;

public class SingingBirds extends Animator {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bill;

	public void init() {
		setLag(6);
	}
	
	public void snapshot(Graphics g){
		g.drawString("___(*)" + (char)('<' + 2 - bill) + "  " + (char)('<' + bill) + "(*)___", 10, 20);
		g.drawString("\\___/    " + "  " + "     \\___/", 10, 35);
	}
	
	public boolean tick() {
		bill = (bill + 1) % 3;	
		return true;
	}
}