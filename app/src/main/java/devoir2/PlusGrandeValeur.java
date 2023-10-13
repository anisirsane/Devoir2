package devoir2;

import java.util.Random;

public class PlusGrandeValeur {
    private List<Integer> chiffres;
    public void generateNum(int choice){
        Random rand = new Random();
        int max = 100;
        int min = 10;
        if (choice==1){
            this.chiffres = new ArrayList<Integer>();
        }else if(choice==2){
            this.chiffres = new LinkedList<Integer>();
        }
        for ( int i =0; i<15; i++){
            this.chiffres.add(rand.nextInt(max - min + 1) + min);
            System.out.println("tableau["+ i +"] = "+ chiffres.get(i));
        }
    }
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
        System.out.println("il est a l;index : " + indexe);
    }
}
