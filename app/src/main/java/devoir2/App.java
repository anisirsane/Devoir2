
/**
* <h1>la plus grande valeur dans une liste</h1>
* <p>ce programme qui affiche un menu a l'utilisateur pour choisr soit l'utilisation d'une arrayList ou bien une Linkedlist
* puis il genere 15 nombres aleatoires et il trouve la valeur la plus grande entre eux</p>

*
* @author  Anis Irsane
* @version 2.0
* @since   2023-10-13
*/
package devoir2;

import java.util.Scanner;
public final class App {
    //ce menu etait cree pour le devoir precedent et reutilise dans ce projet    
    //la fonction pour le choix de menu, ca retourne le choix saisie par l'utilisateur commme un int pour l'utiliser dans notre switch case
    public static int choixMenu(){
    Scanner choice = new Scanner(System.in);
    //affichage des options de menu
    System.out.println("Menu:choisir ce que vous voulez utiliser pour ce programme");
    System.out.println("1. Arraylist (les tableaux): ");
    System.out.println("2. Linkedlist : ");
    System.out.println("Entrez votre choix:");
    //recuperation de choix et les retourner
    int choix = choice.nextInt();   
    return choix;
    }
    //la fonction principale
    public static void main(String[] args) {
        //instanciation de l'objet qu'on a cree
    PlusGrandeValeur chiffre = new PlusGrandeValeur(); 
    //on declare un boolean qu'on utilise pour arreter la boucle d'affichage de menu et le fonctionnement de la methode main  
    boolean var=true;  
    //puisque la mathode main s'execute seuelemnt une fois lorsqu'onlance notre projet java , 
    //on doit mettre tous notre code dans une boucle while qui se narrete pas jusq'a l'obtention d'un resultat.   
    while (var){
        // switch case
        switch(choixMenu()){
            case 1:
                chiffre.generateNum(1);
                chiffre.PlusGrandeVal();
                var = false;
                break;
            case 2:
                chiffre.generateNum(2);
                chiffre.PlusGrandeVal();
                var = false;
                break;
            default:
            /// si l'utilisateur saisie quelque chose autre que les chiffres, il va avoir un message d'erreur 
            // puis avoir le menu de nouveau
                System.out.println("erreur, ressayez! ");
                break;

        }
    }

}
}