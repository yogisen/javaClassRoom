
public class Terrain extends Carte {

	private Couleur couleur;
	
	public Terrain(char c) {
		
		couleur = new Couleur(c);
		System.out.println("un nouveau terrai. ");
	}
	public void afficher() {
		System.out.print("un terrain");
		couleur.afficher();
		System.out.println();
	}
}
