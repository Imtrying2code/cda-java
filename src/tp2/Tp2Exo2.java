package tp2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tp2Exo2 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);	
		String text = JOptionPane.showInputDialog(null, "Saisir un entier : ");
		String text2 = JOptionPane.showInputDialog(null, "Saisir un entier : ");
		
		int valeur1 = Integer.parseInt(text); 
		int valeur21 = Integer.parseInt(text2); 
		JOptionPane.showMessageDialog(null, "Somme = "+ (valeur1 + valeur21)+ " Produit = "+ (valeur1 * valeur21));
	}
}