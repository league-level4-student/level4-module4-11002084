package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	private boolean moveDown = true;

	MovingMorph(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void update() {
		if(getY() <= 100) {
			moveDown = true;
		} else if(getY() >= 400) {
			moveDown = false;
		}
		
		if(moveDown) {
			setY(getY() + 20);
		} else {
			setY(getY() - 20);
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
}
