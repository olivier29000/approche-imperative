package fr.algorithmie;

import java.util.Scanner;

public class InterractifTantQue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		boolean ok=false;

		System.out.println("veuillez saisir une valeur");
		Scanner scanner = new Scanner(System.in) ;
		
		while (!ok) {

			int nb = scanner.nextInt() ;
			if (nb<11 && nb>0) {
				ok=true;
				System.out.println("merci! tu gères!");
			}
			else {
				System.out.println("veuillez saisir une valeur entre 1 et 10");
			}
		}
	}
}
