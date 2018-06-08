package com.tutorial.main;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	
	
	
	//Constructor
	public GameWindow(){
		
		//Initializing all J-type variables
		JFrame frame;
		JMenuBar menuBar;
		JMenu menu1;
		JMenuItem pause, save, restart;
		
		//Instantiating all painted objects
		Object panelGraphics = new Object();
		
		
		
		//Icon for the game (At the moment, it is a maple shield)
		String frameIcon = "MapleShieldIcon.png";
		ImageIcon towerDefenseIcon = new ImageIcon(frameIcon);
		
		
		
		//Creates a title for the game
		frame = new JFrame("Tower Defense");
		
		//Adding all the objects to the frame
		frame.add(panelGraphics);
		
		//The size of the frame
		//frame.setSize(750, 600);
		frame.setSize(1000, 700);
		
		//Creates a menu bar
		menuBar = new JMenuBar();
		
		
		//------------------------------------//
		//             Menu 1				  //
		//------------------------------------//
		
		//Creates a menu with a specific title
		menu1 = new JMenu("Menu 1");
		
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
		
		//Centers the frame
		frame.setLocationRelativeTo(null);
		
		//Focuses on the frame so the user does not need to click on window
		frame.setAutoRequestFocus(true);
		
		//Sets background color to black
		frame.getContentPane().setBackground(Color.white);
		
		//Finds the icon and sets it to the frame
		frame.setIconImage(towerDefenseIcon.getImage());
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

