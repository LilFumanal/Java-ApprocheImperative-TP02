package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		/* Déclaration du tableau **/
		int tableau[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		/* Afficher le premier élément du tableau**/
		System.out.println(tableau[0]);
		/* Afficher la longueur du tableau **/
		System.out.println(tableau.length);
		/*Afficher le dernier élément du tableau**/
		System.out.println(tableau[tableau.length-1]);
		
		/*Modifier la valeur de l'index 4**/
		tableau[4]= 8;

	}

}
