package pion;

import javax.swing.JFrame;



public class Fenetre extends JFrame {
	public Fenetre(){
		
		 

	    this.setTitle("Ma premi�re fen�tre Java");

	    this.setSize(200, 200);

	    this.setLocationRelativeTo(null);               

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    this.setContentPane(new Croix());

	    this.setVisible(true);

	  
	  }
	
	public static void main(String [] args){
		Fenetre croix =new Fenetre();
		
		
		
		
		
	
	  
  
}
}
