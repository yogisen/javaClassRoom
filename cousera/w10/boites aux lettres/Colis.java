
public class Colis extends Courrier {
	private double volume;
	
	public Colis (double poids, boolean express, String adresse, double volume) {
		super(poids,express,adresse);
		this.volume=volume;
	}
	
	// redéfinit affranchirNormal()
		public double affranchirNormal() {
		return 0.25 * volume +getPoids()/1000.0;
		}
		
		public boolean valide () {
			return (super.valide() && volume <= 50);
		}
		public String toString() {
			String s = "Colis\n";
			s += super.toString();
			s += " Volume : " + volume + " litres\n";
			return s;
			}
}
