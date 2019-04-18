package fr.algorithmie;

public class InversionContenu {
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopie = new int [array.length];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
			arrayCopie[array.length-i-1]=array[i];
		}
		
		System.out.println("ARRAY");
		
		for (int i : array) {
			System.out.println(i);
			
		}
		
		System.out.println("ARRAYCOPIE");
		
		for (int i : arrayCopie) {
			System.out.println(i);
			
		}
		
	}
}
