package project;


import java.awt.*;


import javax.swing.*;

import java.io.File;
import javax.imageio.ImageIO;

import java.io.IOException;

public class ArtifactMenu1 extends Menu {
	
	
	
	public ArtifactMenu1(GUI g, int number) throws IOException {
		super(g, number);
		initComponents();
	}

	private void initComponents() throws IOException {
	
	JPanel jPanel1 = new JPanel(new FlowLayout());
	JLabel jLable1 = new JLabel("label1");
	JLabel jLable2 = new JLabel("label2");
	JLabel jLable3 = new JLabel("label3");
	
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1920, 1080));
    add(jPanel1);
    
    jPanel1.add(jLable1);
    jPanel1.add(jLable2);
    jPanel1.add(jLable3);
    

	}
}
