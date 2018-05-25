package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Object extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public Object(){
		
	}
	
	public void paint(Graphics g) {    
		g.setColor(Color.CYAN);
	    g.fillRect(200, 200, 200, 200);
	     
	}
	
	
	

}
