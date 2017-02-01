package morpion;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Cercle extends JPanel{

	public Cercle() {
		this.setSize(100, 100);
	}
	
	public void paintComponent(Graphics g){
		//int x1 = this.getWidth()/4;
		int x1 = 25;
		//int y1 = this.getHeight()/4;
		int y1 = 25;
		g.drawOval(x1, y1, 50, 50);
	}
}
