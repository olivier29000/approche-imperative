package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("veuillez saisir une valeur");
		Scanner scanner = new Scanner(System.in) ;

			int nb = scanner.nextInt() ;
			
			for (int i = 1; i <10; i++) {
				System.out.println(nb+i);
			}
	}

}
