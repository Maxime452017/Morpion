package grille;

import java.util.Random;

public class IAFacile {
	
	public static void main (String [] args){
		
		int [][] tab = { {1,0,0},{0,1,0},{0,0,0} };
		
		int i = 0;
		int j = 0;
	
		Random ri = new Random();
		int valeuri = 0 + ri.nextInt(3 - 0);
		
		//System.out.println(valeuri);
		
		Random rj = new Random();
		int valeurj = 0 + rj.nextInt(3 - 0);
		
		//System.out.println(valeurj);

		int a = 0;
		while (a == 0){ 
		
		if (tab[valeuri][valeurj] == 0){
			tab[valeuri][valeurj] = 10;
			a++;
		}
		}
		
		for( i = 0; i < 3; i++ )
		{    
		  for( j = 0; j < 3; j++ )
		  {
		    System.out.print(tab[i][j] +" ");       
		  }
		  System.out.println("");   
		}
		
		
		 
	}

}



