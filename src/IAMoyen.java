package grille;

public class IAMoyen extends IAFacile {
	
	public static void main (String [] args){
		
		//On crée un tableau tab avec un compteur de lignes i et un compteur de colonnes y
		
		int [][] tab = { {1,0,1},{0,0,1},{0,0,1} };
		
		int i;
		int j;
		
		
		int b = 0;
		
		 

			for ( i = 0; i <= 2; i++ ){
				for ( j = 0; j <= 2; j++ ){
			
				if (tab[0][i] + tab[1][i] + tab[2][i] == 2){
					if (tab[0][i] == 0){
						tab[0][i] = 10;
						b++;	
					}
					else if (tab[1][i] == 0){
						tab[1][i] = 10;
						b++;
					}
					else if (tab[2][i] == 0){
						tab[2][i] = 10;
						b++;
					}

				}
			
		
			do {	
				
				 if (tab[j][0] + tab[j][1] + tab[j][2] == 2){
						if (tab[j][0] == 0){
							tab[j][0] = 10;
							b++;
						}
						else if (tab[j][1] == 0){
							tab[j][1] = 10;
							b++;
						}
						else if (tab[j][2] == 0){
							tab[j][2] = 10;
							b++;
					}
						b++;
					}
			}while (b == 0);
			
			
			do{
				
	
				 if (tab[0][0] + tab[1][1] + tab [2][2] == 2){
								if (tab[0][0] == 0){
									tab[0][0] = 10;
									b++;
								}
								else if (tab[1][1] == 0){
									tab[1][1] = 10;
									b++;
								}
								else if (tab[2][2] == 0){
									tab[2][2] = 10;
									b++;
								}
							}
			}while(b == 0);
			
			
			do{
								
						

				 if (tab[2][0] + tab[1][1] + tab [0][2] == 2){
								if (tab[2][0] == 0){
									tab[2][0] = 10;
									b++;
								}
								else if (tab[1][1] == 0){
									tab[1][1] = 10;
									b++;
								}
								else if (tab[0][2] == 0){
									tab[0][2] = 10;
									b++;
								}
							}
			}while(b == 0);
				
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
	
