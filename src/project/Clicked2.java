package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Clicked2 implements ActionListener {
	
	private MainMenu menu;
	private File file;
	
	
	public Clicked2(MainMenu m, File f) {
		menu = m;
		file = f;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			GUI gui = new GUI(file);
			gui.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		menu.dispose();
		
	}

}
