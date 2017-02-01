package morpion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class Grille extends JFrame {
	
	public String jeu = "lancement";
	public JPanel panel;
	public JPanel panelNORTH;
	public JPanel panelCENTER;
	public JPanel panelSOUTH;
	
	
	public Grille() {
		setTitle("Grille");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		panelNORTH = new JPanel();
		panel.add(panelNORTH, BorderLayout.NORTH);
		
		panelCENTER = new JPanel();
		panel.add(panelCENTER, BorderLayout.CENTER);
		
		panelSOUTH = new JPanel();
		panel.add(panelSOUTH, BorderLayout.SOUTH);
		
		if ( jeu == "lancement" ) {
			
			JLabel label = new JLabel("Nom du joueur ? :");
			panelNORTH.add(label);
			JTextField nomTextField = new JTextField(15); // rentrer du text
			panelNORTH.add(nomTextField);
			
			JButton entrer = new JButton("entrer");
			panelNORTH.add(entrer);
			entrer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelNORTH.removeAll();
					JLabel nomLabel = new JLabel("Bienvenue " + nomTextField.getText() );
					nomLabel.setBackground(Color.GREEN);
					//nomLabel.setCaretColor(Color.WHITE);
					nomLabel.setForeground(Color.BLUE);
					panelNORTH.add(nomLabel);
					panelNORTH.updateUI();
					afficheGrille();
				}
			});
		}
		this.add(panel);
	}
	
	public void afficheGrille() {
		
		JPanel panelGrille = new JPanel();
		panelGrille.setSize(new Dimension(300,300));
		panelGrille.setLayout(new GridLayout( 3, 3));
		
//		JButton bouton = new JButton("click");
//		bouton.setPreferredSize(new Dimension(500, 500));
//		panel.add(bouton);
		
		JPanel panelBouton11 = new JPanel();
		JButton bouton11 = new JButton("");
		bouton11.setPreferredSize(new Dimension(100, 100));
		panelGrille.add(bouton11, 0, 0);
		JButton bouton12 = new JButton("");
		bouton12.setPreferredSize(new Dimension(100, 100));
		panelGrille.add(bouton12, 0, 1);
		JButton bouton13 = new JButton("");
		bouton13.setPreferredSize(new Dimension(100, 100));
		panelGrille.add(bouton13, 0, 2);
		JButton bouton21 = new JButton("");
		panelGrille.add(bouton21, 1, 0);
		JButton bouton22 = new JButton("");
		panelGrille.add(bouton22, 1, 1);
		JButton bouton23 = new JButton("");
		panelGrille.add(bouton23, 1, 2);
		JButton bouton31 = new JButton("");
		panelGrille.add(bouton31, 2, 0);
		JButton bouton32 = new JButton("");
		panelGrille.add(bouton32, 2, 1);
		JButton bouton33 = new JButton("");
		panelGrille.add(bouton33, 2, 2);
		
//		GridBagLayout gbl = new GridBagLayout();
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.gridx = 1;
//		gbc.gridy = 1;
//		gbc
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// this.add(panelGrille, BorderLayout.CENTER);
		panelCENTER.add(panelGrille);
		//this.add(panel);
		
		bouton11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton11");
				Cercle cercle = new Cercle();
				panelGrille.add(cercle, 0, 0);
				panelGrille.remove(bouton11);
				
				panelGrille.updateUI();
				//bouton11.setText("8");
			}
		});
		bouton12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton12");
				Cercle cercle = new Cercle();
				panelGrille.add(cercle, 0, 1);
				panelGrille.remove(bouton12);
				
				panelGrille.updateUI();
				//bouton11.setText("8");
			}
		});
	}
	public static void main(String[] args) {
		Grille c = new Grille();
		c.setVisible(true);
	}

}
