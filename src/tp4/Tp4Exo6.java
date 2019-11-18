/* Nom du répertoire : TP4
* Nom du projet : Tp4Exo6
* Nom de la classe : Tp4Exo6
* Auteur : Franck */

package tp4;
import java.util.Scanner ;

public class Tp4Exo6{
    public static void main(String[] args) {
        Scanner lecture_clavier = new Scanner(System.in);
        
        int i, entier=-1,
        	impair=1,
        	somme=1;
        
        
        while (entier < 0 || entier > 100){
        System.out.println("Veuillez entrer un entier entre 0 et 100 inclus");
        
        entier = lecture_clavier.nextInt();}
        lecture_clavier.close();
        
        for (i=1; i<entier; i++){
                impair += 2;
                somme += impair;
                System.out.println("La somme est "+somme);
            }
        System.out.println("La somme est "+somme);
    }
}