package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameWindow extends Canvas{

	private static final long serialVersionUID = 1L;
	
	
	
	//Constructor
	public GameWindow(int width, int height, String title, String menu1Title){
		
		//Initializing all J-type variables
		JFrame frame;
		JMenuBar menuBar;
		JMenu menu1;
		JMenuItem pause, save, restart;
		
		
		
		//Creates a title for the game
		frame = new JFrame(title);
		
		//Creates a menu bar
		menuBar = new JMenuBar();
		
		
		//------------------------------------//
		//             Menu 1				  //
		//------------------------------------//
		
		//Creates a menu with a specific title
		menu1 = new JMenu(menu1Title);
		
		//Adds the menu to the menu bar
		menuBar.add(menu1);
		
		//Creates a sub menu with different tasks
		pause = new JMenuItem("Pause (WIP)");
		save = new JMenuItem("Save (WIP)");
		restart = new JMenuItem("Restart (WIP)");
		
		//Adds options to menu1
		menu1.add(pause);
		menu1.add(save);
		menu1.add(restart);
		
		//------------------------------------//
		//           End of Menu 1		      //
		//------------------------------------//
		
		//Sets the menu bar in the frame
		frame.setJMenuBar(menuBar);
		
		//Clicking X will close the game
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This will show the frame
		frame.setVisible(true);
		
		//Users will not be able to change the frame size
		frame.setResizable(false);
		
		//These will take in the width and height and adjust the frame to their respective values within MainGame.java
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		//Centers the frame
		frame.setLocationRelativeTo(null);
		
		//Focuses on the frame so the user does not need to click on window
		frame.setAutoRequestFocus(true);
		
		//Sets background color to black
		frame.getContentPane().setBackground(Color.black);
		
		
		//lol
		
		
	}
	
	
	
	

}

