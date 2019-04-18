package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int commence=0;
		int nBatonnets=21;
		int nBatonnetsOrdinateur;
		int nBatonnetsJoueur;
		boolean coupSerieuxJoueur=false;
		
		System.out.println("/////JEU DES 21 BATONNETS/////");
		System.out.println("/////RAPPEL DES REGLES////////");
		System.out.println("Nous jouons l'unn contre l'autre (moi l'ordinateur contre toi l'humain)");
		System.out.println("Nous avons 21 battonnets devant nous, les voila");
		System.out.println("");
		System.out.println("| | | | | | | | | | | | | | | | | | | | |");
		System.out.println("Nous jouons chacun à notre tour, en prenant un, deux ou trois batonnets");
		System.out.println("Celui qui prend le dernier batonnet perd!");
		
		System.out.println("Veux-tu commencer?");
		System.out.println("tape 1: oui je commence");
		System.out.println("tape 2: non, c'est toi l'odinateur qui commence");
		while (commence!=1 && commence!=2) {
			Scanner scanner = new Scanner(System.in) ;
			commence  = scanner.nextInt()  ;	
		}
		
		
		if (commence==1) {
			System.out.println("Commence!!!");
		}
		else {
			System.out.println("Je commence!!!");
			nBatonnetsOrdinateur = 1 + (int)(Math.random() * ((3 - 1) + 1));
			System.out.println("Je prends " + nBatonnetsOrdinateur + " batonnets");
			nBatonnets=nBatonnets-nBatonnetsOrdinateur;
				System.out.println();
				System.out.println("Il reste " + nBatonnets + " batonnets");
				System.out.println("à toi de jouer");
		}

		System.out.println("");
		System.out.println("| | | | | | | | | | | | | | | | | | | | |");
		

		
		
		while (nBatonnets>0){
			System.out.println();
			System.out.println("Combien de batonets veux tu prendre? Entre un et trois");
			Scanner scanner = new Scanner(System.in) ;
				
			while (!coupSerieuxJoueur) {
					nBatonnetsJoueur = scanner.nextInt() ;
					if (nBatonnetsJoueur!=1 &&nBatonnetsJoueur!=2 &&nBatonnetsJoueur!=3) {
						System.out.println("Tu dois prendre entre un et trois batonnets");
					}
					else {
						System.out.println("Tu prends " + nBatonnetsJoueur + " batonnets");
						coupSerieuxJoueur=true;
						nBatonnets=nBatonnets-nBatonnetsJoueur;
					}
					
				}
				
			coupSerieuxJoueur=false;
			
				if (nBatonnets>0) {
					System.out.println();
					System.out.println("Il reste " + nBatonnets + " batonnets");
					
					for (int i = 0; i < nBatonnets; i++) {
						System.out.print("| ");
					}
					System.out.println();
					
					
					System.out.println("à moi de jouer");
					
					
					if (nBatonnets-1==17 || nBatonnets-1==13 || nBatonnets-1==9|| nBatonnets-1==5 || nBatonnets-1==1) {
						nBatonnetsOrdinateur=1;
					}
					else if (nBatonnets-2==17 || nBatonnets-2==13 || nBatonnets-2==9|| nBatonnets-2==5 || nBatonnets-2==1) {
						nBatonnetsOrdinateur=2;
					}
					else if (nBatonnets-3==17 || nBatonnets-3==13 || nBatonnets-3==9|| nBatonnets-3==5 || nBatonnets-3==1) {
						nBatonnetsOrdinateur=3;
					}
					else {
						nBatonnetsOrdinateur = 1 + (int)(Math.random() * ((3 - 1) + 1));
					}
					
					System.out.println("Je prends " + nBatonnetsOrdinateur + " batonnets");
					nBatonnets=nBatonnets-nBatonnetsOrdinateur;
					
					if (nBatonnets>0) {
						System.out.println();
						System.out.println("Il reste " + nBatonnets + " batonnets");
						for (int i = 0; i < nBatonnets; i++) {
							System.out.print("| ");
						}
						System.out.println();
						System.out.println("à toi de jouer");
					}
					else {
						System.out.println();
						System.out.println("TU AS GAGNE !!!!!!");
					}
					
					
				}
				else {
					System.out.println();
					System.out.println("J'AI GAGNE !!!!!!");
				}
				
				
		}
	}

}
