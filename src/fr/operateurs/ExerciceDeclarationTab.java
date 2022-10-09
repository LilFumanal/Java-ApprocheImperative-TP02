package fr.operateurs;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] tableau = new int[8];
tableau[0]= 8;
tableau[1]=-7;
tableau[2]=12;
tableau[3]=1;
tableau[4]=-2;
tableau[5]=14;
tableau[6]=17;
tableau[7]=9;

System.out.println(tableau[0]);
System.out.println(tableau.length);
System.out.println(tableau[(tableau.length)-1]);
System.out.println(tableau[10]); // Cette ligne sera en erreur, car il n'y a pas de dixième index.
	}

}
