package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		boolean enCoursDeTri = true;
		int n;

		while (enCoursDeTri == true) {
			enCoursDeTri = false;

	

			for (int i = 0; i < array2.length - 1; i++) {

				if (array2[i] > array2[i + 1]) {
					n = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = n;
					enCoursDeTri = true;
				}
			}

		}

		for (int i : array2) {
			System.out.println(i);
		}
	}

}
