
public class Lettre extends Courrier {
	
	private String format = "";
	
	public Lettre(double poids,boolean express, String adresse, String format) {
		super(poids,express,adresse);
	this.format = format;
	

}

	public double affranchirNormal() {
		double montant = 0;
		if (format.equals("A4")) {
			montant = 2.0;
		} else {
			montant = 3.5;
		}
		montant += getPoids()/1000.0;
		return montant;
	}
	public String toString() {
		String s = "Lettre\n";
		s += super.toString();
		s += " Format : " + format + "\n";
		return s;
		}
	}
	
	