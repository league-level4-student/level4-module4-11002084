package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	private int circleIteration = 0;
	
	CircleMorph(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		circleIteration++;
		
		setX((int)(Math.cos(circleIteration % 360) * 100) + 100);
		setY((int)(Math.sin(circleIteration % 360) * 100) + 100);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
}
