package tp2_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DossierPharmacie {
	private String nom ;
	private HashMap <String , patient >patients ;
	public DossierPharmacie (String n){
		nom =n.toLowerCase();
		patients = new HashMap <String , patient >();
	}
	void nouveauPatient ( String nom , patient ord ){
		patients.put(nom, ord);
	}
	public boolean ajoutMedicament (String nom, String m){
		patient p= patients.get(nom);
		p.ajoutMedicament(m);
		if (p==null) {
			return false;
		}else {
			return true;
		}
		
		
	}
	public void affichePatient (String nom){
		System.out.println(nom);
	}
	public void affiche (){
		System.out.println("Nom de la pharmacie : " + nom);
        for (patient p : patients.values()) {
            p.affiche();
        }
	}
	public Collection <String > affichePatientAvecMedicament (String m){
		Collection<patient> p=new ArrayList<>();
        Collection<patient> lp=patients.values();
        Iterator<patient>t=lp.iterator();
        while(t.hasNext()) {
        }
		return null;
	}
	@Override
	public String toString() {
		return "DossierPharmacie [nom=" + nom + ", patients=" + patients + "]";
	}
}
