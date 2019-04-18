package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		int n=1;
		int caseEnDernier=0;
		
		caseEnDernier=array2[array2.length-1];
		
		while (n!=array2.length) {
			array2[array2.length-n]=array2[array2.length-n-1];

			n++;
		}
		
		array2[0]=caseEnDernier;
		
		for (int i : array2) {
			System.out.println(i);
		}
		
	}

}
