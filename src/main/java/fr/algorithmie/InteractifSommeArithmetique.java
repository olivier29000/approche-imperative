package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somme=0;
		System.out.println("veuillez saisir une valeur");
		Scanner scanner = new Scanner(System.in) ;

			int nb = scanner.nextInt() ;
			
			for (int i = 1; i <=nb; i++) {
				somme=somme+i;
			}
			System.out.println(somme);
	}

}
