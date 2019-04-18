package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nMoinsUn=1;
		double nMoinsDeux=0;
		double resultat=0;
		int niveauSelectionne=0;
		int n = 1;
		
		Scanner scanner = new Scanner(System.in) ;

		niveauSelectionne = scanner.nextInt() ;
		
		
		
			while (n!=niveauSelectionne){
				resultat=nMoinsDeux+nMoinsUn;
				nMoinsDeux=nMoinsUn;
				nMoinsUn=resultat;
				n++;
			}
			
			System.out.println(resultat);
			
	}

}
