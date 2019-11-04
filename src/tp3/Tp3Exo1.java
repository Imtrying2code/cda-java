package tp3;
/* Réaliser un programme qui permet de traiter (lire et afficher) 
 * tous les types primitifs du langage JAVA, 
 * ainsi   que les chaînes de caractères (String).    
 * Rappel : Les types primitifs sont : 
 * boolean, byte, char, short, int, long, float et double.   
 * Remarques :  La saisie d'une valeur réelle se fait en utilisant 
 * une virgule et non pas un point.    
 * La saisie d'un booléen se fait en tapant false ou true 
 * (et non pas 0 ou 1).    Lecture.clavier.nextLine(); 
 * // Vide le tampon clavier. 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tp3Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner user = new Scanner(System.in);	
	
	byte valeur_1 = 10;
	System.out.println("Saisir une valeur en 'byte' : ");
	valeur_1 = user.nextByte();
	System.out.println("Les bytes valent : "+ valeur_1);
	
	user.nextLine();
	boolean valeur_2 = true;
	System.out.println("Saisir 'true' or 'false' : ");
	valeur_2 = user.nextBoolean();
	System.out.println("La valeur booléan vaut : "+ valeur_2);
	
	user.nextLine();
	short valeur_3 = 10;
	System.out.println("Saisir une valeur shirt en 'byte' entre '-32768' et '32767' : ");
	valeur_3 = user.nextShort();
	System.out.println("La valeur shirt vaut : "+ valeur_3);
	
	user.nextLine();
	long valeur_4 = 10;
	System.out.println("Saisir une valeur longue entre '-9223372036854775 808' et '9223372036854775 807' : ");
	valeur_4 = user.nextLong();
	System.out.println("La valeur longue vaut : "+ valeur_4);
	
	user.nextLine();
	float valeur_5 = 10;
	System.out.println("Saisir une valeur float entre '+/-1.4e-45' et '+/-3.4e38' : ");
	valeur_5 = user.nextFloat();
	System.out.println("La valeur float vaut : "+ valeur_5);
	
	user.nextLine();
	double valeur_6 = 10;
	System.out.println("Saisir une valeur Double entre '+/. 4.940e-324' et '+/-1.797e308' : ");
	valeur_6 = user.nextDouble();
	System.out.println("La valeur Double vaut : "+ valeur_6);
	
	user.nextLine();
	char valeur_7 = 'h';
	System.out.println("Saisir un 'charactère' : ");
	valeur_7 = user.next().charAt(0);
	System.out.println("Le charactère est : "+ valeur_7);
	
	user.nextLine();
	String valeur_8 = "Hello World !";
	System.out.println("Saisir une chaine de 'charactères' : ");
	valeur_8 = user.nextLine();
	System.out.println("La chaine de charactère est : "+ valeur_8);
	
	user.close();
	}

}
