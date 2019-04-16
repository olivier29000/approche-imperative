package fr.tableau;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] tab ={1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(tab[0]);
		System.out.println(tab[tab.length - 1]);
		// l'entier 5 est situé à l'index 5
		System.out.println(tab.length);
		//System.out.println(tab[10]);
		// la ligne précédente donne une erreur car l'index 10 n'existe pas
		tab[4]=8;
		System.out.println(tab[4]);
		
	}
	
	
}
