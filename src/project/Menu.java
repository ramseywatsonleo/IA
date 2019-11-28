package project;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.io.File;
import java.io.FileWriter;

import javax.imageio.ImageIO;

import java.io.IOException;

public class Menu extends JFrame {
	
	private GUI gui;
	public int ButtonNumber;


	public Menu(GUI g, int number) throws IOException {
		
		gui = g;
		ButtonNumber = number;
        initComponents();
    }
	
	@SuppressWarnings("null")
	private void initComponents() throws IOException {
	
	JPanel jPanel1 = new JPanel(new FlowLayout());
	File[] images = null;
	
	
	Menu Menu = this;

	if (ButtonNumber == 1) {
		images = GUI.documents;
	}
	else {
		images = GUI.artifacts;
	}
	
	
	
	File[] imageList = images;
	JButton[] buttons = new JButton[imageList.length];
	imgs = new BufferedImage[imageList.length];
	ImageIcon[] imgIcons = new ImageIcon[imageList.length];
	
	
	double heightScaleFactor;
	

	
	
	
	for (int i = 0; i < imageList.length; i++) {
		buttons[i] = new JButton();
		imgIcons[i] = new ImageIcon();
		imgs[i] = ImageIO.read(imageList[i]);
		heightScaleFactor = imgs[i].getHeight() / 230.0;
		imgIcons[i].setImage(imgs[i].getScaledInstance((int)(imgs[i].getWidth() / heightScaleFactor), (int)(imgs[i].getHeight() / heightScaleFactor), Image.SCALE_DEFAULT));
        buttons[i].setIcon(imgIcons[i]);
        
        buttons[i].addActionListener(new Clicked(gui, i, Menu));
        
        
        jPanel1.add(buttons[i]);
	}

	
	setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    setSize(new java.awt.Dimension(600, 1000));
    add(jPanel1);
    
    addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			
		    
            Menu.dispose();

        }
    });
    

    

    

	}

	
	static BufferedImage[] imgs;
}
