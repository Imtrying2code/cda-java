/*Nom du répertoire : src
Nom du projet : Tp4
Nom de la classe : Exo2
Auteur : Franck */

package tp4;

import java.util.Scanner;

public class Tp4Exo2 
{

	public static void main(String[] args) 
	{
		/* Programme de notes au clavier avec moyenne.
		Arrêt de la saisie des notes avec '-1' */
		Scanner user = new Scanner(System.in);
		
		//var
		float somme = 0;
		
		//Boucle qui va demander des notes jusqu'a ce que la valeur -1 soit saise.
		int i =-1;
		int compteur =0;
		float note =0;
		do
			{
			System.out.println("Saisir une note : ");
			note = user.nextFloat();
			if(note >=i) 
			{
			somme += note;
			compteur +=1;
			}
			}while (note >i);
		// Calcul de la moyenne et l'afffiche.
	System.out.println("La moyenne est de : "+ (somme/compteur));	
	user.close();
		
	}
}
