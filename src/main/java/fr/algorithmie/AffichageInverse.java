package fr.algorithmie;

public class AffichageInverse {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopie = new int [array.length];
		
		
		
		
		for (int i : array) {
			System.out.println(i);
			
		}
		
		System.out.println("///////////////////////////");
		
		
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
			
		}
		
		System.out.println("///////////////////////////");
		
		for (int i = 0; i < array.length; i++) {
			arrayCopie[i]=array[i];
		}
		
		System.out.println("///////////////////////////");
		
		for (int i : arrayCopie) {
			System.out.println(i);
			
		}
	}
}
