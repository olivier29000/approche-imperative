package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("ENTIERS SUPERIEURS A 3");
		for (int i = 0; i < array.length; i++) {
			if (array[i]>3) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("ENTIERS PAIRS");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("INDEX PAIRS");
		for (int i = 0; i < array.length; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("ENTIERS IMPAIRS");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2!=0) {
				System.out.println(array[i]);
			}
		}
		
		
	}

}
