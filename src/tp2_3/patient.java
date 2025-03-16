package tp2_3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class patient {
	private String nom ;
	private Set <String > ordonnance ;
	public patient(String n){
		nom = n.toLowerCase() ;
		setOrdonnance(new HashSet <String >());
	}
	public String getNom () { 
		return nom ;
	}
	public Set <String > getOrdonnance() {
		return ordonnance;
	}
	@Override
	public String toString() {
		return "patient [nom=" + nom + ", ordonnance=" + ordonnance + "]";
	}
	public void setOrdonnance(Set <String > ordonnance) {
		this.ordonnance = ordonnance;
	}
	public boolean ordonnanceVide (){
		return ordonnance.isEmpty();
	}
	public void ajoutMedicament ( String m) {
		ordonnance.add(m);
	}
	
	public void affiche(){
		System.out.println(this);
	}
	public boolean contientMedicament (String m) {
		return ordonnance.contains(m);
	}
	public void trieOrdonnace() {
		TreeSet<String> ts=new TreeSet<>();
		for (String e:ts) {
			System.out.println(e);
		}
	}
}
