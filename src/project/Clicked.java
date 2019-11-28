package project;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;



public class Clicked implements ActionListener {
	
	public int ButtonNumber;
	private GUI gui;
	private Menu menu;
	
	public Clicked(GUI g, int x, Menu m) {
		gui = g;
		ButtonNumber = x;
		menu = m;
	}

	public void actionPerformed(ActionEvent e) {

		BufferedImage img = Menu.imgs[ButtonNumber];
		
		
		double heightScaleFactor = img.getHeight() / 680.0;
		System.out.println(heightScaleFactor);
		
		ImageIcon imgicon = new ImageIcon(img);
		imgicon.setImage(imgicon.getImage().getScaledInstance((int)(imgicon.getIconWidth() / heightScaleFactor), (int)(imgicon.getIconHeight() / heightScaleFactor), Image.SCALE_SMOOTH));
		
		
		
	
		
		if (menu.ButtonNumber == 1) {
			
			
			gui.setDocImage(imgicon);
		}
		else if (menu.ButtonNumber == 2) {
			
			/*if (GUI.artifacts.length >= 2 && (imgicon.getIconWidth() + GUI.artifactImage2.getIconWidth() + GUI.documentImage.getIconWidth()) > 1920) {
	        	//double imgRatio = (double)img2.getWidth(null) / (double)img3.getWidth(null);
	        	double scaleFactor = (double) (imgicon.getIconWidth() + GUI.artifactImage2.getIconWidth()) / (double) (1920 - GUI.documentImage.getIconWidth()); 
	        	GUI.artifactImage.setImage(imgicon.getImage().getScaledInstance((int)(imgicon.getIconWidth() / scaleFactor),
	            		(int)(imgicon.getIconHeight() / scaleFactor), Image.SCALE_SMOOTH));
	        	GUI.artifactImage2.setImage(GUI.artifactImage2.getImage().getScaledInstance((int)(GUI.artifactImage2.getIconWidth() / scaleFactor),
		        		(int)(GUI.artifactImage2.getIconHeight() / scaleFactor), Image.SCALE_SMOOTH));
	        	System.out.println(scaleFactor);
	        	System.out.println(imgicon.getIconWidth() + GUI.artifactImage2.getIconWidth());
	        	System.out.println((1920 - GUI.documentImage.getIconWidth()));
	        }*/
			
			imgicon.setImage(imgicon.getImage().getScaledInstance((int)(imgicon.getIconWidth() / GUI.scaleFactor), (int)(imgicon.getIconHeight() / GUI.scaleFactor), Image.SCALE_SMOOTH));
			gui.setArtImage1(imgicon);
			
			
			
		}
		else {
			
			
			/*if (GUI.artifacts.length >= 2 && (GUI.artifactImage.getIconWidth() + imgicon.getIconWidth() + GUI.documentImage.getIconWidth()) > 1920) {
	        	//double imgRatio = (double)img2.getWidth(null) / (double)img3.getWidth(null);
	        	double scaleFactor = (double) (GUI.artifactImage.getIconWidth() + imgicon.getIconWidth()) / (double) (1920 - GUI.documentImage.getIconWidth()); 
	        	gui.setArtImage1(new ImageIcon(GUI.artifactImage.getImage().getScaledInstance((int)(GUI.artifactImage.getIconWidth() / scaleFactor),
	            		(int)(GUI.artifactImage.getIconHeight() / scaleFactor), Image.SCALE_SMOOTH)));
	        	gui.setArtImage2(new ImageIcon(imgicon.getImage().getScaledInstance((int)(imgicon.getIconWidth() / scaleFactor),
		        		(int)(imgicon.getIconHeight() / scaleFactor), Image.SCALE_SMOOTH)));
	        	System.out.println(scaleFactor);
	        	System.out.println(GUI.artifactImage.getIconWidth() + GUI.artifactImage2.getIconWidth());
	        	System.out.println((1920 - GUI.documentImage.getIconWidth()));
	        }*/
			
			imgicon.setImage(imgicon.getImage().getScaledInstance((int)(imgicon.getIconWidth() / GUI.scaleFactor), (int)(imgicon.getIconHeight() / GUI.scaleFactor), Image.SCALE_SMOOTH));
			gui.setArtImage2(imgicon);

			
		}
		
		
		
		
		
		
		menu.dispose();
		
	}
	
}