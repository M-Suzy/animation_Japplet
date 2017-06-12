package animation;


import java.awt.Graphics;
import java.util.Random;

public class Race extends Animator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Random generator = new Random();
	private int posT = 0, posH = 0, dist = 80;
	private String dots = "";
	private final int MOVET[] = {3, 3, 3, 3, 3, -6, -6, 1, 1, 1};
	private final int MOVEH[] = {0, 0, 9, 9, -12, 1, 1, 1, -2, -2};
	
	public void init() {
		for (int i = 0; i < dist; i++)
			dots += ".";
		setSize(dist * 10, 60);
		setLag(5);
	}
	
	public void snapshot(Graphics paper) {
		paper.drawString(dots.substring(0, posT) + "T" + dots.substring(0, dist - posT), 20, 20);
		paper.drawString(dots.substring(0, posH) + "H" + dots.substring(0, dist - posH), 20, 40);
	}

	public boolean tick() {
		posT += MOVET[generator.nextInt(10)];
		if (posT < 0)
			posT = 0;
		else if (posT > dist) 
			posT = dist;
		
		posH += MOVEH[generator.nextInt(10)];
		if (posH < 0)
			posH = 0;
		else if (posH > dist)
			posH = dist;
		
		return posT < dist && posH < dist;
	}
}