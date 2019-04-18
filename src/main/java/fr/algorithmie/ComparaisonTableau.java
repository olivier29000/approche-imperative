package fr.algorithmie;



public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		int n=0;
		int nombreDeDoublons=0;
		
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = i+1; j < array1.length; j++) {
				if (array1[i]==array1[j]) {
					n++;
					array1[i]=Integer.MIN_VALUE;
				}
			}
		}
		

		
		int[] array3=new int[array1.length-n];

		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]!=Integer.MIN_VALUE) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i]==array2[j]) {
						array3[i]=array3[i]+1;
					}
				}
			}
		}
		
		for (int i : array3) {
			if (i>0) {
				nombreDeDoublons=nombreDeDoublons+1;
			}
		}
		
		System.out.println("Il y a " + nombreDeDoublons + " doublons entre ces deux tableaux");
		System.out.println("Les chiffres ");
		for (int i = 0; i < array3.length; i++) {
			if (array3[i]>0) {
				System.out.println(array1[i] + ", ");
			}
		}
		System.out.println(" sont des doublons");
	}

}
