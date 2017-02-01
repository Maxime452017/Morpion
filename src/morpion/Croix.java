package morpion;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Croix extends JPanel{
	 public void paintComponent(Graphics g){
		    Graphics2D g2 = (Graphics2D) g;
		    g2.setStroke(new BasicStroke(5));
		    g2.drawLine(25, 25, 75, 75);
		    g2.drawLine(25, 75, 75, 25);
		  }               
		}
