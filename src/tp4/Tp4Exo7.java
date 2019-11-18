/* Nom du répertoire : TP4
* Nom du projet : Tp4Exo7
* Nom de la classe : Tp4Exo7
* Auteur : Franck 
* Réaliser un programme : 
* => L'utilisateur saisie un nombre entre 0 et +2147483647.
* => L'uitisateur saisi un bit entre 0 et 31 bits.
* => Après traitement le programme affichera la valeur du bits saisie (0 ou 1).
*/

package tp4;

import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int entier, bits, resultat = 10, resultat_mod;
		String bitsStrings = "";
		System.out.println("Veuillez saisir un entier entre 0 et +2147483647 inclus");
		entier = user.nextInt();

		System.out.println("Veuillez saisir un bit entre 0 et 31 inclus");
		bits = user.nextInt();
		if (bits > bitsStrings.length()) {
			System.out.println("Valeur du bit à la position "+ bits+" puissance de 2 est :"+ 0);
		} else {
		do {
			resultat = (entier / 2);			
			resultat_mod = entier % 2;
			entier=resultat;
			bitsStrings = bitsStrings + resultat_mod;
		} while (entier >= 1);

		System.out.println("Valeur du bit à la position "+ bits+" puissance de 2 est :"+ bitsStrings.charAt(bits));
		
		user.close();
		}
	}
}
