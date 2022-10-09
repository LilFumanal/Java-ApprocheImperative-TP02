package fr.boucles;

public class ExercicesBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 int a = array.length;
		 /*Afficher le tableau dans l'ordre**/
		 for (int i = 0 ; i < a ; i++) {
			 System.out.println(array[i]);
		 }
		 /*Afficher le tableau dans l'ordre inverse**/
		 for (int i = a-1; i >= 0 ; i--) {
			 System.out.println(array[i]);
		 }
		 /*Afficher les entiers > 3**/
		 for (int i = 0 ; i < a ; i++) {
			 if(array[i] > 3) {
			 System.out.println(array[i]);
			 }
		 }
		 /*Afficher les entiers paires**/
		 for (int i = 0 ; i < a ; i++) {
			 if(array[i]%2 == 0) {
			 System.out.println(array[i]);
			 }
		 }
		 /*Afficher les index paires**/
		 for (int i = 0 ; i < a ; i++) {
			 if(i%2 == 0) {
			 System.out.println(array[i]);
			 }
		 }
		 /*Afficher les entiers impaires**/
		 for (int i = 0 ; i < a ; i++) {
			 if(array[i]%2 != 0) {
			 System.out.println(array[i]);
			 }
		 }
	}

}
