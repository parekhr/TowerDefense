package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MainMenu extends Canvas{
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		Rectangle r = new Rectangle(0, 0, 20 ,20);
		g.drawRect(0, 0, 60, 60);
		g.setColor(Color.red);
	}

}
