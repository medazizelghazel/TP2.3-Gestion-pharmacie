package tp2_3;

public class maine {

	public static void main(String[] args) {
		patient p1=new patient("aziz");
		patient p2=new patient("taher");
		patient p3=new patient("nadia");
		patient p4=new patient("lamia");
		DossierPharmacie d1=new DossierPharmacie("pharmaci nasser");
		p1.ajoutMedicament("dolleprane");
		p1.ajoutMedicament("pedatdine");
		p2.ajoutMedicament("m1");
		p2.ajoutMedicament("m2");
		p3.ajoutMedicament("m");
		p4.ajoutMedicament("m4");
		p4.ajoutMedicament("m5");
		p4.ajoutMedicament("6");
		d1.nouveauPatient("aziz", p1);
		d1.nouveauPatient("taher", p2);
		d1.nouveauPatient("nadia", p3);
		d1.nouveauPatient("lamia", p4);
		d1.
	}

}
