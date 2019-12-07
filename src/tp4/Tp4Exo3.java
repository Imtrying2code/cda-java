/*
 * Nom du répertoire : TP4
 * Nom du projet : Tp4Exo3
 * Nom de la classe : Tp4Exo3
 * Auteur : Franck 
*/


package tp4;
import java.util.Scanner;

public class Tp4Exo3 
{

	public static void main(String[] args) 
	{
		/* Afficher un triangle rempli d'étoiles s'entend sur 
		 * nombre de lignes fourni en donnée. */
		Scanner user = new Scanner(System.in);
		int l,i;
		String etoile ="";
		
		System.out.println("Saisir un nombre de ligne : ");
		l = user.nextInt();
			
		for (i=1; i<=l; i++){
			etoile += "*";
		    System.out.println(etoile);
		}

		user.close();
		
	}

}
