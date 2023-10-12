package devoir2;
import java.util.Iterator;

public class Etudiant {
	private ArrayList<Integer> notes;
	private LinkedList<String> cours;
	
	public Etudiant() {
		this.notes = new ArrayList<Integer>();
		this.cours = new LinkedList<String>();
	}
	
	public void AjouterNote(int note) {
		this.notes.add(note);
	}
	
	public float moyenne() {
		Iterator<Integer> itr = this.notes.iterator();
		int sommeNotes = 0;
		while(itr.hasNext()) {
			sommeNotes += itr.next();
		}
		return sommeNotes/this.notes.size();
	}
	
	public void AjouterCours(String cours) {
		this.cours.add(cours);
	}
	
	public void AfficherToutLesCours() {
		System.out.println(this.cours.toString());
	}
	
	public void rhema() {
		throw new ArithmeticException("Message d'erreur / par 0 impossible!");
	}
}
