package pion;

import javax.swing.JFrame;



public class Fenetre extends JFrame {
	public Fenetre(){
		
		 

	    this.setTitle("Ma premi�re fen�tre Java");

	    this.setSize(400, 400);

	    this.setLocationRelativeTo(null);               

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    this.setContentPane(new Cercle());

	    this.setVisible(true);

	  
	  }
	
	public static void main(String [] args){
		Fenetre cercle =new Fenetre();
		
		
		
		
	
	  
  
}
}
