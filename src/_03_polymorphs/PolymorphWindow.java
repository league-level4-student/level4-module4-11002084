package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph[] polyList;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 addMouseListener(this);
   	 
   	 polyList = new Polymorph[]{new BluePolymorph(50, 50), 
   			 					new RedMorph(100, 100),
   			 					new MovingMorph(150, 100),
   			 					new CircleMorph(100, 0),
   			 					new FollowMorph(0, 0),
   			 					new ImageMorph(200, 200),
   			 					new MessageMorph(300, 200)};
   	 
   	 window.pack();
   	 window.setVisible(true);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i = 0; i < polyList.length; i++) {
   		 polyList[i].draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	repaint();
    	for(int i = 0; i < polyList.length; i++) {
    	  	polyList[i].update();
    	}
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < polyList.length; i++) {
			if(polyList[i] instanceof MessageMorph) {
				if(e.getX() >= polyList[i].getX() && e.getX() < polyList[i].getX() + polyList[i].getWidth()) {
					if(e.getY() >= polyList[i].getY() && e.getY() < polyList[i].getY() + polyList[i].getHeight()) {
						JOptionPane.showMessageDialog(null, "MessageMorph Clicked");
					}
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
