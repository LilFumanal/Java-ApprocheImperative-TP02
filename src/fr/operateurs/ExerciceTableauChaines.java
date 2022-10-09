package fr.operateurs;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] villes = {"Paris", "Bordeaux","Bali", "Malte","Nice"};
		
		System.out.println(villes[0]);
		System.out.println(villes[1]);
		System.out.println(villes[2]);
		System.out.println(villes[3]);
		System.out.println(villes[4]);

		System.out.println(villes.length);
		
		villes[3] = "Reims";
		System.out.println(villes[0]);
		System.out.println(villes[1]);
		System.out.println(villes[2]);
		System.out.println(villes[3]);
		System.out.println(villes[4]);
		
		System.out.println(villes.length);
	}

}
