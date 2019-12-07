/*
 * Nom du répertoire : TP4
 * Nom du projet : Tp4Exo1
 * Nom de la classe : Tp4Exo1
 * Auteur : Franck 
*/
package tp4;

import java.util.Scanner;

	public class Tp4Exo1 
	{
	public static void main(String[] args) 
	{
		/* Programme de notes au clavier avec moyenne.
		Demande combien de note : 4 */
		Scanner user = new Scanner(System.in);
		
		//Nombre de Notes
		float somme = 0;
		float nnote;
		int i;
		
		System.out.print("Nombre de notes à saisir ? : xx ");
		nnote = user.nextInt();
	
		/*Boucle qui va demander le nombre de notes, 
		puis les demander en saisie.*/
		
		for (i=0; i<nnote; i++)
			{
			System.out.println("Saisir une note : ");
			float note = user.nextFloat();
			somme += note;
			}
		// Calcul de la moyenne et l'afffiche.
	System.out.println("La moyenne est de : "+ (somme/i));	
	user.close();
		
	}

}
