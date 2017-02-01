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
				GrilleAffiche grilleAffiche = new GrilleAffiche();
				panelCENTER.add(grilleAffiche);
				panelCENTER.updateUI();
				
			}
		});
		
		
		this.add(panel);
	}
	
//	public void afficheGrille() {
//		
//		JPanel panelGrille = new JPanel();
//		panelGrille.setSize(new Dimension(300,300));
//		//panelGrille.setLayout(new GridLayout( 3, 3));
//		
////		bouton.setPreferredSize(new Dimension(500, 500));
//		
//		GridBagLayout gbl = new GridBagLayout();
//		GridBagConstraints gbc = new GridBagConstraints();
//		
//		JButton bouton00 = new JButton("");
//		bouton00.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		gbc.weightx = 1;
//		gbc.weighty = 1;
//		gbl.setConstraints( bouton00, gbc);
//		panelGrille.add(bouton00);
//		
//		JButton bouton10 = new JButton("");
//		bouton10.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 1;
//		gbc.gridy = 0;
//		gbl.setConstraints( bouton10, gbc);
//		panelGrille.add(bouton10);
//		
//		JButton bouton20 = new JButton("");
//		bouton20.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 2;
//		gbc.gridy = 0;
//		gbl.setConstraints( bouton20, gbc);
//		panelGrille.add(bouton20);
//		
//		JButton bouton01 = new JButton("");
//		bouton01.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 0;
//		gbc.gridy = 1;
//		gbl.setConstraints( bouton01, gbc);
//		panelGrille.add(bouton01);
//		
//		JButton bouton11 = new JButton("");
//		bouton11.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 1;
//		gbc.gridy = 1;
//		gbl.setConstraints( bouton11, gbc);
//		panelGrille.add(bouton11);
//		
//		JButton bouton21 = new JButton("");
//		bouton21.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 2;
//		gbc.gridy = 1;
//		gbl.setConstraints(bouton21, gbc);
//		panelGrille.add(bouton21);
//		
//		JButton bouton02 = new JButton("");
//		bouton02.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 0;
//		gbc.gridy = 2;
//		gbl.setConstraints(bouton02, gbc);
//		panelGrille.add(bouton02);
//		
//		JButton bouton12 = new JButton("");
//		bouton12.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 1;
//		gbc.gridy = 2;
//		gbl.setConstraints(bouton12, gbc);
//		panelGrille.add(bouton12);
//		
//		JButton bouton22 = new JButton("");
//		bouton22.setPreferredSize(new Dimension(100, 100));
//		gbc.gridx = 2;
//		gbc.gridy = 2;
//		gbl.setConstraints(bouton22, gbc);
//		panelGrille.add(bouton22);
//		
//		panelGrille.setLayout(gbl);
//		
//		
//		// this.add(panelGrille, BorderLayout.CENTER);
//		panelCENTER.add(panelGrille);
//		//this.add(panel);
//		
//		
//							// Listener
//		
//		bouton00.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton00");
//				panelGrille.remove(bouton00);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 0;
//				gbc.gridy = 0;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//				//bouton11.setText("8");
//			}
//		});
//		
//		bouton10.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton10");
//				panelGrille.remove(bouton10);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 1;
//				gbc.gridy = 0;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//				//bouton11.setText("8");
//			}
//		});
//		
//		bouton20.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton20");
//				panelGrille.remove(bouton20);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 2;
//				gbc.gridy = 0;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//				//bouton11.setText("8");
//			}
//		});
//		
//		bouton01.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton01");
//				panelGrille.remove(bouton01);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 0;
//				gbc.gridy = 1;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//				//bouton11.setText("8");
//			}
//		});
//		
//		bouton11.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton11");
//				panelGrille.remove(bouton11);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 1;
//				gbc.gridy = 1;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//				//bouton11.setText("8");
//			}
//		});
//		
//		bouton21.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton21");
//				panelGrille.remove(bouton21);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 2;
//				gbc.gridy = 1;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//			}
//		});
//		
//		bouton02.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton02");
//				panelGrille.remove(bouton02);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 0;
//				gbc.gridy = 2;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//			}
//		});
//		
//		bouton12.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton12");
//				panelGrille.remove(bouton12);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 1;
//				gbc.gridy = 2;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//			}
//		});
//		
//		bouton22.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("bouton22");
//				panelGrille.remove(bouton22);
//				Cercle cercle = new Cercle();
//				cercle.setPreferredSize(new Dimension(100, 100));
//				gbc.gridx = 2;
//				gbc.gridy = 2;
//				gbl.setConstraints(cercle, gbc);
//				panelGrille.add(cercle);
//				panelGrille.revalidate();
//				panelGrille.repaint();
//			}
//		});
//	}
	
	public void actionListenerO() {
//		bouton00.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton00");
//			panelGrille.remove(bouton00);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 0;
//			gbc.gridy = 0;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//			//bouton11.setText("8");
//		}
//	});
//	
//	bouton10.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton10");
//			panelGrille.remove(bouton10);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 1;
//			gbc.gridy = 0;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//			//bouton11.setText("8");
//		}
//	});
//	
//	bouton20.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton20");
//			panelGrille.remove(bouton20);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 2;
//			gbc.gridy = 0;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//			//bouton11.setText("8");
//		}
//	});
//	
//	bouton01.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton01");
//			panelGrille.remove(bouton01);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 0;
//			gbc.gridy = 1;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//			//bouton11.setText("8");
//		}
//	});
//	
//	bouton11.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton11");
//			panelGrille.remove(bouton11);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 1;
//			gbc.gridy = 1;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//			//bouton11.setText("8");
//		}
//	});
//	
//	bouton21.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton21");
//			panelGrille.remove(bouton21);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 2;
//			gbc.gridy = 1;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//		}
//	});
//	
//	bouton02.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton02");
//			panelGrille.remove(bouton02);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 0;
//			gbc.gridy = 2;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//		}
//	});
//	
//	bouton12.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton12");
//			panelGrille.remove(bouton12);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 1;
//			gbc.gridy = 2;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//		}
//	});
//	
//	bouton22.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("bouton22");
//			panelGrille.remove(bouton22);
//			Cercle cercle = new Cercle();
//			cercle.setPreferredSize(new Dimension(100, 100));
//			gbc.gridx = 2;
//			gbc.gridy = 2;
//			gbl.setConstraints(cercle, gbc);
//			panelGrille.add(cercle);
//			panelGrille.revalidate();
//			panelGrille.repaint();
//		}
//	});

	}
	
	
	public static void main(String[] args) {
		Grille c = new Grille();
		c.setVisible(true);
	}

}
