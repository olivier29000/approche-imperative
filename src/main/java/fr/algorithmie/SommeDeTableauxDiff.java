package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[] premierTableau = {1, 15, -3, 0, 5, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
				int[] deuxiemeTableau={-1, 12, 17, 14, 5, -9, 0, 18 } ;

				
				if (premierTableau.length>deuxiemeTableau.length) {
					int [] sommeDesTableaux=new int [premierTableau.length];
					
					
					for (int i = 0, j=0; i < sommeDesTableaux.length; i++) {
						
						if (j<deuxiemeTableau.length){
							sommeDesTableaux[i]=premierTableau[i]+deuxiemeTableau[i];
						}
						else {
							sommeDesTableaux[i]=premierTableau[i];
						}
						j++;
						
					}
					
					for (int i : sommeDesTableaux) {
						System.out.println(i);
					}
					
				}
				else {
					int [] sommeDesTableaux=new int [deuxiemeTableau.length];
					
					for (int i = 0, j=0; i < sommeDesTableaux.length; i++) {
						
						if (j<premierTableau.length){
							sommeDesTableaux[i]=premierTableau[i]+deuxiemeTableau[i];
						}
						else {
							sommeDesTableaux[i]=deuxiemeTableau[i];
						}
						j++;
						
					}
					
					for (int i : sommeDesTableaux) {
						System.out.println(i);
					}

				}
				
				
				
				
			}
	}


