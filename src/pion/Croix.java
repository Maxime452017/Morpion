package pion;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Croix extends JPanel{
	 public void paintComponent(Graphics g){
		  
		   
		    Graphics2D g2 = (Graphics2D) g;
		    
		    g2.setStroke(new BasicStroke(5));
		  
		    
		    //x1, y1, x2, y2
		    
		    g2.drawLine(50, 50, 125, 125);
		    g2.drawLine(50, 125, 125,50);
		  }               
		}


