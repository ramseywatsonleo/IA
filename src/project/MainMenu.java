package project;




import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;


public class MainMenu extends JFrame {
	
	
	public MainMenu() {
		initComponents();
	}
	
	
	private void initComponents() {
		
		
		JPanel jPanel1 = new JPanel(); 
		
		File[] options = new File("artifacts").listFiles();
		

		JButton[] buttons = new JButton[options.length];
		
		MainMenu menu = this;

		
		for (int i = 0; i < options.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText(options[i].getName());
			
			buttons[i].addActionListener(new Clicked2(menu, options[i]));
	        
	        jPanel1.add(buttons[i]);
		}
		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    setSize(new java.awt.Dimension(600, 600));
	    add(jPanel1);
	    setTitle("What file would you like to open?");
		
		
	}
	

}
