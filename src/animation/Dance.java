package animation;

import java.awt.*;

import Body.*;

public class Dance extends Animator {

	/**
	 * 
	 */
	private static final long serialVersionUID =2L;
	private Body dancer;
	private int size = 100;
	
	public void init() {
		setSize(4 * size, 4 * size);
		dancer = new Body(2 * size, size, size);
		setLag(2);
	}

	public void snapshot(Graphics g) {
		dancer.draw(g);
	}
	
	public boolean tick() {
		dancer.move();
		return true;
	}	
}