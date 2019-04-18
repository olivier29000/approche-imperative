package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbAleatoire=(int)(Math.random()*100)+1;
		boolean trouve=false;
		int nbEnCours;
		int N=0;
		
		
		System.out.println("je pense à un nombre entre 0 et 100, essayez de le deviner!!");
		while (!trouve) {
			Scanner scanner = new Scanner(System.in) ;
			nbEnCours= scanner.nextInt() ;
			N++;
			
			if (nbEnCours>nbAleatoire) {
				System.out.println("plus petit!");
			}
			else if (nbEnCours<nbAleatoire) {
				System.out.println("plus grand!");
			}
			else if (nbEnCours==nbAleatoire) {
				trouve=true;
				System.out.println("bien joué, vous avez trouvé en " + N + " coups");
			}
			
			
		}
	}

}

