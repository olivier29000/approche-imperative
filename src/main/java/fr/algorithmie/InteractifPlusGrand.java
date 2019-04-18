package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbEnCours= Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		System.out.println("veuillez saisir 10 valeurs");
		
			
			
			for (int i = 1; i < 11; i++) {
				Scanner scanner = new Scanner(System.in) ;
				System.out.println("chiffre " + i);
				nbEnCours= scanner.nextInt() ;
				if (nbEnCours>max) {
					max=nbEnCours;
				}
			}
		
			
			System.out.println("le maimum des chiffres que vous avez affiché est le " +max);
	}

}
