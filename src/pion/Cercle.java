package pion;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Cercle extends JPanel{
	public void paintComponent(Graphics g){
		//int x1 = this.getWidth()/4;
		int x1 = 100;
		//int y1 = this.getHeight()/4;
		int y1 = 100;
		g.drawOval(x1, y1, 100, 100);
		
		
		
	}
}
	


