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

public class GrilleAffiche extends JPanel {
	
	public JPanel panelGrille;
	public GridBagLayout gbl;
	public GridBagConstraints gbc;
	public JButton bouton00;
	public JButton bouton10;
	public JButton bouton20;
	public JButton bouton01;
	public JButton bouton11;
	public JButton bouton21;
	public JButton bouton02;
	public JButton bouton12;
	public JButton bouton22;
	
	public void GrilleAffiche() {
				
		this.setSize(new Dimension(300,300));
		//panelGrille.setLayout(new GridLayout( 3, 3));
		
//		bouton.setPreferredSize(new Dimension(500, 500));
		
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		
		bouton00 = new JButton("");
		bouton00.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints( bouton00, gbc);
		add(bouton00);
		
		bouton10 = new JButton("");
		bouton10.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbl.setConstraints( bouton10, gbc);
		add(bouton10);
		
		bouton20 = new JButton("");
		bouton20.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbl.setConstraints( bouton20, gbc);
		add(bouton20);
		
		bouton01 = new JButton("");
		bouton01.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbl.setConstraints( bouton01, gbc);
		add(bouton01);
		
		bouton11 = new JButton("");
		bouton11.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbl.setConstraints( bouton11, gbc);
		add(bouton11);
		
		bouton21 = new JButton("");
		bouton21.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbl.setConstraints(bouton21, gbc);
		add(bouton21);
		
		bouton02 = new JButton("");
		bouton02.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbl.setConstraints(bouton02, gbc);
		add(bouton02);
		
		bouton12 = new JButton("");
		bouton12.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbl.setConstraints(bouton12, gbc);
		add(bouton12);
		
		bouton22 = new JButton("");
		bouton22.setPreferredSize(new Dimension(100, 100));
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbl.setConstraints(bouton22, gbc);
		add(bouton22);
		
		setLayout(gbl);
		setVisible(true);
		
		// this.add(panelGrille, BorderLayout.CENTER);
		//panelCENTER.add(panelGrille);
		//this.add(panel);
	}
	
	public void actionListenerO() {
		
		bouton00.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton00");
				remove(bouton00);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 0;
				gbc.gridy = 0;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton10");
				remove(bouton10);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 1;
				gbc.gridy = 0;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton20");
				remove(bouton20);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 2;
				gbc.gridy = 0;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton01");
				remove(bouton01);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 0;
				gbc.gridy = 1;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton11");
				remove(bouton11);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 1;
				gbc.gridy = 1;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton21");
				remove(bouton21);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 2;
				gbc.gridy = 1;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
			}
		});
		
		bouton02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton02");
				remove(bouton02);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 0;
				gbc.gridy = 2;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
			}
		});
		
		bouton12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton12");
				remove(bouton12);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 1;
				gbc.gridy = 2;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
			}
		});
		
		bouton22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton22");
				remove(bouton22);
				Cercle cercle = new Cercle();
				cercle.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 2;
				gbc.gridy = 2;
				gbl.setConstraints(cercle, gbc);
				add(cercle);
				revalidate();
				repaint();
			}
		});
	}
	
	public void actionListenerX() {
		
		bouton00.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton00");
				remove(bouton00);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 0;
				gbc.gridy = 0;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton10");
				remove(bouton10);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 1;
				gbc.gridy = 0;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton20");
				remove(bouton20);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 2;
				gbc.gridy = 0;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton01");
				remove(bouton01);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 0;
				gbc.gridy = 1;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton11");
				remove(bouton11);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 1;
				gbc.gridy = 1;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
				//bouton11.setText("8");
			}
		});
		
		bouton21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton21");
				remove(bouton21);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 2;
				gbc.gridy = 1;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
			}
		});
		
		bouton02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton02");
				remove(bouton02);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 0;
				gbc.gridy = 2;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
			}
		});
		
		bouton12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton12");
				remove(bouton12);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 1;
				gbc.gridy = 2;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
			}
		});
		
		bouton22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("bouton22");
				remove(bouton22);
				Croix croix = new Croix();
				croix.setPreferredSize(new Dimension(100, 100));
				gbc.gridx = 2;
				gbc.gridy = 2;
				gbl.setConstraints(croix, gbc);
				add(croix);
				revalidate();
				repaint();
			}
		});
	}

}
