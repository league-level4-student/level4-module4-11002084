package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	Image img;

	ImageMorph(int x, int y) {
		super(x, y);
		try {
			img = ImageIO.read(new File("C:/Users/Riley/Documents/GitHub/level4-module4-11002084/src/_03_polymorphs/DogImage.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(), getWidth(), getHeight(), null);
	}
}
