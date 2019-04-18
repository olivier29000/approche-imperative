package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int n=0;
		int minimum;
		int indexMinimum=0;
		
		for (int i = 0; i < array2.length; i++) {
			minimum=array2[i];

			indexMinimum=i;
			
			
			for (int j = i+1; j < array2.length; j++) {
				if (minimum>array2[j]) {
					minimum=array2[j];
					indexMinimum=j;

				}
			}
			
			
			
			
			
			if (indexMinimum!=i) {
				n=array2[i];
				array2[i]=array2[indexMinimum];
				array2[indexMinimum]=n;
			}
			
		}
		
		System.out.println("////////////RESULTAT//////////////");
		for (int i : array2) {
			System.out.print(i +", ");
		}
		
	}

}
