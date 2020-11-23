package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    int getX() {
    	return x;
    }
    
    int getY() {
    	return y;
    }
    
    int getWidth() {
    	return width;
    }
    
    int getHeight() {
    	return height;
    }
    
    void setX(int x) {
    	this.x = x;
    }
    
    void setY(int y) {
    	this.y = y;
    }
    
    void setWidth(int width) {
    	this.width = width;
    }
    
    void setHeight(int height) {
    	this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
