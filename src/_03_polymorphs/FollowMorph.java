package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class FollowMorph extends Polymorph{

	FollowMorph(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		setX(MouseInfo.getPointerInfo().getLocation().x - 25);
		setY(MouseInfo.getPointerInfo().getLocation().y - 35);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
}