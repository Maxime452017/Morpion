package morpion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Menu extends JFrame {
	
	public Menu() {
		setSize(300, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		this.add(panelPrincipal);
		JButton bouton = new JButton("bouton");
		panelPrincipal.add(bouton);
		JLabel label = new JLabel("je suis un label");
		panelPrincipal.add(label);
		JSlider slider = new JSlider(30, 60, 35);
		panelPrincipal.add(slider);
		
		
	}
	
	public static void main(String[] args) {
		SimpleJFrame f = new SimpleJFrame();
		f.setVisible(true);
	}
	

}
