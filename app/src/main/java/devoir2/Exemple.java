package devoir2;
import java.util.Iterator;

public class Exemple {
    
    private ArrayList<Integer> Liste1;
    private LinkedList<String> Liste2;

    private int somme = 0;
    private double moyenne = 0;

    public Exemple() {
        this.Liste1 = new ArrayList<Integer>();
        this.Liste2 = new LinkedList<String>();
    }

    public int getSomme(){
        return this.somme;
    }

    public double getMoyenne(){
        return this.moyenne;
    }

    public void Add(int entier){
        this.Liste1.add(entier);
        this.somme += entier;
        this.moyenne();
    }

    public void Add(String chaine){
        this.Liste2.add(chaine);
    }
    public void remove1(int index){
        if(index == 0)
            throw new ArrayIndexOutOfBoundsException("Message specifique");

        if(index > 0 ){
            this.somme -= this.Liste1.get(index);
            this.moyenne();
            this.Liste1.remove(index);
        }
    }

    public void removeAll(){
        while (Liste1.size() > 1) {
            this.remove1(Liste1.size()-1);
        }
    }

    public void remove2(int index){
        this.Liste2.remove(index);
    }

    public String toString(){
        return this.Liste1.toString() + this.Liste2.toString();
    }

    private void moyenne(){
        this.moyenne = (double)this.somme/(double)this.Liste1.size();
    }

}
