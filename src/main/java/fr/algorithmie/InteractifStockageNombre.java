package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean quitterProgramme=false;
		int instructionUtilisateur=0;
		int [] tab=new int[0];
		int nbAStocker;
		
		while (!quitterProgramme) {
			
			System.out.println("Que voulez-vous faire?");
			System.out.println("Pour afficher les nombres stockés, tapez 1");
			System.out.println("Pour stocker un nouveau nombre, tapez 2");
			System.out.println("Pour quitter le programme, tapez 3");
			
			Scanner scanner = new Scanner(System.in) ;
			instructionUtilisateur  = scanner.nextInt()  ;	
			
			if (instructionUtilisateur==1){
				if (tab.length!=0) {
					System.out.println("voila les valeurs que vous avez stocké");
					for (int i = 0; i < tab.length; i++) {
						System.out.print(tab[i] + ", ");
					}
					System.out.println("");
				}
				else {
					System.out.println("Il n'y a aucun nombre de stocké");
				}
				
			}
			
			else if (instructionUtilisateur==2) {
				System.out.println("Quel nombre voulez vous stocker?");
				Scanner truc = new Scanner(System.in) ;
				nbAStocker  = truc.nextInt()  ;
				
				int [] tabUtile=new int[tab.length + 1];
				if (tab.length!=0) {
					for (int i = 0; i < tab.length; i++) {
						tabUtile[i]=tab[i];
					}
					tabUtile[tab.length]=nbAStocker;
				}
				else {
					tabUtile[0]=nbAStocker;
				}
				tab=tabUtile;
				System.out.println("Vous avez stocké le chiffre " + nbAStocker);
			}
			
			else if (instructionUtilisateur==3){
				System.out.println("Vous quittez le programme");
				quitterProgramme=true;
			}
			
			else {
				System.out.println("C'est pourtant pas compliqué! tu as le choix entre taper 1, 2 ou 3....");
			}
		}
		
	}

}
