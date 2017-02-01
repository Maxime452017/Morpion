package morpion;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Cercle extends JPanel{
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(5));
		g.drawOval(25, 25, 50, 50);
	}
}
