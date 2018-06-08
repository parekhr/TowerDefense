package com.tutorial.main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Object extends JPanel implements ActionListener, KeyListener{
	
	private static final long serialVersionUID = 1L;
	Font towerFont = new Font("Times New Roman", Font.BOLD, 30);
	Font creepScoreFont = new Font("Times New Roman", Font.BOLD, 20);
	Font goldFont = new Font("Times New Roman", Font.BOLD, 20);
	
	Timer timer = new Timer(100, this);
	
	
	
	
	private double x = 450;
	private double y = 500;
	private double xVelPlayer = 0;
	private double yVelPlayer = 0;
	private double xVelLaser = 0;
	private double yVelLaser = 0;
	private int creepScore = 0;
	
	public Object() {
		timer.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	
	public void paintComponent(Graphics g) {   
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//Player Sprite
	    g2.setColor(Color.CYAN);
	    g2.fill(new Rectangle2D.Double(x, y, 50, 50));
	    
	    //Laser Sprite
	    g2.setColor(Color.GREEN);
	    g2.fill(new Rectangle2D.Double(x+17, y, 10, 30));
	    
	    //Bottom rectangle(Tower)
	    g.setColor(Color.RED);
	    g.fillRect(0, 550, 1000, 100);
	    
	    //Tower Text
	    g.setColor(Color.BLACK);
	    g.setFont(towerFont);
	    g.drawString("PROTECT ME", 370, 600);

	    //Creep Score
	    g.setColor(Color.GREEN);
	    g.setFont(creepScoreFont);
	    g.drawString("Score: ", 800, 50);
	    
	    //Gold
	    g.setColor(Color.YELLOW);
	    g.setFont(goldFont);
	    g.drawString("Gold: ", 800, 75);
	    
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		/*x += xVel;
		y += yVel;
		repaint();
		*/
		
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_ESCAPE) {
			System.exit(1);
		}
		if(key == KeyEvent.VK_UP) {
			//Make y velocity go up
			yVelPlayer= -10;
			xVelPlayer = 0;
			
			//Checking for out of bounds
			if(y <= 0) {
				yVelPlayer = 0;
			}
			else {
				y += yVelPlayer;
				repaint();
				System.out.println("Moving up");
			}
			
			
		}
		if(key == KeyEvent.VK_DOWN) {
			//Make y velocity go down
			yVelPlayer = 10;
			xVelPlayer = 0;
			
			//Checking for out of bounds
			if(y >= 500) {
				yVelPlayer = 0;
			}
			else {
				y += yVelPlayer;
				repaint();
				System.out.println("Moving down");
			}
			
		}
		if(key == KeyEvent.VK_LEFT) {
			//Make x velocity go down
			xVelPlayer = -10;
			yVelPlayer = 0;
			
			//Checking for out of bounds
			if(x <= 000) {
				xVelPlayer = 0;
			}
			else {
				x += xVelPlayer;
				repaint();
				System.out.println("Moving left");
			}
			
			
		}
		if(key == KeyEvent.VK_RIGHT) {
			//Make x velocity go up
			xVelPlayer = 10;
			yVelPlayer = 0;
			
			//Checking for out of bounds
			if(x >= 950) {
				xVelPlayer = 0;
			}
			else {
				x += xVelPlayer;
				repaint();
				System.out.println("Moving right");
			}
			
		}
		if(key == KeyEvent.VK_SPACE) {
			//Fires a laser from the player
			System.out.println("Firing laser");
			for(int i = 0; y <= 0; i++) {
				yVelLaser++;
				repaint();
			}
			
			
		}
	}
		

		
	public void keyReleased(KeyEvent e){	
		
	}

		
	public void keyTyped(KeyEvent e) {
		
	}
	
		
}

	
