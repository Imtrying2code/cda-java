package tp3;

	import java.util.Scanner;

	public class Tp3Exo4 {
	public static void main(String[] args) {
		
		/*EXO 4 : Réaliser un programme permettant d’exprimer en secondes un temps donné 
 		en heures-minutes-secondes.*/
		
		Scanner user = new Scanner(System.in);
		
		int heure;
		System.out.print("Saisir une durée en heure(s) = xx ");
		heure = user.nextInt();
		
		int minute;
		System.out.print("Saisir une durée en minute(s) = xx ");
		minute = user.nextInt();
		
		int seconde;
		System.out.print("Saisir une durée en seconde(s) = xx ");
		seconde = user.nextInt();
		
		System.out.println("Total converti en secondes = " + ((heure*60*60)+(minute*60)+(seconde)));
		
		user.close();
	}

}
