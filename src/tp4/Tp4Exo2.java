package tp4;

import java.util.Scanner;

public class Tp4Exo2 
{

	public static void main(String[] args) 
	{
		/* Programme de notes au clavier avec moyenne.
		Arr�t de la saisie des notes avec '-1' */
		Scanner user = new Scanner(System.in);
		
		//var
		float somme = 0;
		
		//Boucle qui va demander des notes jusqu'a ce que la valeur -1 soit saise.
		int i =0;
		int j =-1;
		int compteur =0;
		float note =0;
		do
			{
			System.out.println("Saisir une note : ");
			note = user.nextFloat();
			if(note !=j) 
			{
			somme += note;
			compteur +=1;
			}
			}while (note >j);
		// Calcul de la moyenne et l'afffiche.
	System.out.println("La moyenne est de : "+ (somme/compteur));	
	user.close();
		
	}
}
