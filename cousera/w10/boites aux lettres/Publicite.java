
public class Publicite extends Courrier {
	
	public Publicite(double poids, boolean express, String adresse) {
		super(poids,express,adresse);
	}
	// redéfinit affranchirNormal()
	public double affranchirNormal() {
	return getPoids()/1000.0 * 5.0;
	}

	// inutile de red'efinir la méthode valide() pour les publicités
	
	public String toString() {
	String s = "Publicité\n";
	s += super.toString();
	return s;
	
	
	}
}
