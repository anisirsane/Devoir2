/*
projet      : un exercice pour comparer la plus grande valeur d'une arraylist ou d'une linkedlist
Version     : 0.1
Auteur      : Anis Irsane
Date        : 12-10-2023
Description : c'est pour apprendre a utiliser les linkedlist et les arrayslist, dans ce cas je fais un exemple
                        selon les directives donnees dans devoir2

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
    PlusGrandeValeur chiffre = new PlusGrandeValeur();
    //declaration des variables
    // switch case
    switch(choixMenu()){
        case 1:
            chiffre.generateNum(1);
            chiffre.PlusGrandeVal();
            break;
        case 2:
            chiffre.generateNum(2);
            chiffre.PlusGrandeVal();
            break;
        default:
        /// si l'utilisateur saisie quelque chose autre que les chiffres, il va avoir un message d'erreur 
        // puis avoir le menu de nouveau
            System.out.println("erreur, ressayez! ");
            choixMenu();
        break;

    }
}
}