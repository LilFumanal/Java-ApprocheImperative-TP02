package fr.boucles;

public class ExerciceBouclesBase {

	public static void main(String[] args) {
		
		 /* Exo 1: Afficher tous les nombres de 1 à 10 **/ 
		int a = 1;
		while(a != 11) {
				System.out.println(a);
				a++;
			}
		
		/* Exo 2: Afficher 20 fois mon nom et prénom. **/
		int b = 0;
		while(b < 20) {
			System.out.println("Lil Fumanal");
			b++;
		}
		
		/* Exo 3: Afficher tous les nombres paires entre 2 et 100 **/
		for(int c = 1; c<=100; c++) {
			if (c%2 == 0) {
				System.out.println(c);
			}
		}
		
		
		/* Exo 3: Afficher tous les nombres paires entre 2 et 100 **/
		for(int d = 1; d<100; d++) {
			if (d%2 != 0) {
				System.out.println(d);
			}
		}
		
	}
}
	
