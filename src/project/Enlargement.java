package project;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.*;

public class Enlargement extends JFrame {
	
	private Image img;
	
	public Enlargement(Image image) throws IOException {
		img = image;
		initComponents();
	}
	
	private void initComponents() throws IOException {
		ImageIcon icon = new ImageIcon();
		double heightScaleFactor = img.getHeight(null) / 1000.0;
		icon.setImage(img.getScaledInstance((int)(img.getWidth(null) / heightScaleFactor), (int)(img.getHeight(null) / heightScaleFactor), Image.SCALE_SMOOTH));
		Enlargement enlarge = this;
		
		JLabel label = new JLabel(icon);
		
		add(label);
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	    setSize(new java.awt.Dimension(icon.getIconWidth(), 1050));
	    
	    addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
			    
	            enlarge.dispose();

	        }
	    });
	}

}
