package tp1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tp1Exo1 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
				
		
		int valeur_1;
		System.out.print("Saisir un entier : ");
		valeur_1 = user.nextInt();
		int valeur_2;
		System.out.print("Saisir un entier : ");
		valeur_2 = user.nextInt();
		
		
		System.out.print("Somme des deux valeurs : "+ (valeur_1+valeur_2)+ " Produit des deux valeurs : "+ (valeur_1 * valeur_2));
		
		user.close();
	}

}
