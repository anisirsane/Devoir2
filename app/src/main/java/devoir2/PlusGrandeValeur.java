package devoir2;

import java.util.Random;
//notre classe pour la generation de la liste des nombres et l'ebtention de la plus grande valeur.
public class PlusGrandeValeur {
    private List<Integer> chiffres;
    public void generateNum(int choice){
        //on genere les nombres avec la fonction random
        Random rand = new Random();
        int max = 100;
        int min = 10;
        if (choice==1){
            //on fait le choix selon la decision de l'utilisateur
            this.chiffres = new ArrayList<Integer>();
        }else if(choice==2){
            this.chiffres = new LinkedList<Integer>();
        }
        //apres la decision si on va utiliser une arraylist ou bien une linkedlist, on remplit chiffres avec les valeurs qu'on a genere
        for ( int i =0; i<15; i++){
            this.chiffres.add(rand.nextInt(max - min + 1) + min);
            System.out.println("tableau["+ i +"] = "+ chiffres.get(i));
        }
    }
    //recuperation de la plus grande valeur
    public void PlusGrandeVal(){
        int nbrGrand = chiffres.get(0);
        int indexe = 0;
        for(int i=1;i<15;i++){
            if (nbrGrand<chiffres.get(i)){
                nbrGrand = chiffres.get(i);
                indexe = i;
            }
        }
        System.out.println("le plus grand nombre du tableau est : " + nbrGrand);
        System.out.println("il est a l'index : " + indexe);
    }
}
