package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageMorph extends Polymorph {
	
	MessageMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
}
