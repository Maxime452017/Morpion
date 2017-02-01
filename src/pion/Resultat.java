package pion;

public class Resultat {
	public static void main(String [] args) {
		
		int tab[][] = {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		
		if ( tab[0][0] + tab[0][1] + tab[0][2] == 3 
		  || tab[0][0] + tab[1][0] + tab[2][0] == 3 
		  || tab[0][0] + tab[1][1] + tab[2][2] == 3
		  || tab[0][1] + tab[1][1] + tab[2][1] == 3
		  || tab[0][2] + tab[1][2] + tab[2][2] == 3
		  || tab[1][0] + tab[1][1] + tab[1][2] == 3
		  || tab[2][0] + tab[2][1] + tab[2][2] == 3
		  || tab[0][2] + tab[1][1] + tab[2][0] == 3){
		
		
			System.out.println("Joueur 1 à gagné !");
		}
		
		else

		{ if ( tab[0][0] + tab[0][1] + tab[0][2] == 30
			   || tab[0][0] + tab[1][0] + tab[2][0] == 30
			   || tab[0][0] + tab[1][1] + tab[2][2] == 30
			   || tab[0][1] + tab[1][1] + tab[2][1] == 30
			   || tab[0][2] + tab[1][2] + tab[2][2] == 30
			   || tab[1][0] + tab[1][1] + tab[1][2] == 30
			   || tab[2][0] + tab[2][1] + tab[2][2] == 30
			   || tab[0][2] + tab[1][1] + tab[2][0] == 30)
			
			System.out.println("Joueur 2 à gagné !");
			
		else
			
			

			    System.out.println("Match nul !");}
			
			
		
		
		
	}
}
