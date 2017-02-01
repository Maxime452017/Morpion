
package morpion;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

//import gui.SimpleDrawing;


public class Affichage extends JFrame {
	
	public Affichage() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textAffiche hello = new textAffiche();
		this.add(hello);
		
	}

	
//	public static void main(String[] args) {
//		//SimpleJFrame frame = new SimpleJFrame();
//		//frame.setVisible(true);
//		Menu titre = new Menu("Titre");
//		titre.setVisible(true);
//	}

}
