package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 5, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int min=array[0];
		
		for (int i : array) {
			if (i<min) {
				min=i;
			}
			
			
		}
		
		System.out.println("Le maximum du tableau est le chiffre " + min);
		
	}

}
