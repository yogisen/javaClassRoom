
public class Jeu {
	private int nombreCartes;
	private Carte []cartes;
	
	public Jeu(int nb) {
		nombreCartes = nb;
		cartes = new Carte[nb];
		
		System.out.println("on change de main");
	}
	// joue une carte apres l autre
	public void joue() {
		System.out.println("je joue une carte ....");
		int i = 0;
		while ((cartes[i] == null )&& i < nombreCartes) {
			i++;
		}
		if ((i< nombreCartes) && (cartes[i] !=null )) {
			System.out.println("la carte jouée est :");
			cartes[i].afficher();
			cartes[i] = null;
		} else {
			System.out.println("plus de cartes");
		}
		
	}
	// ajoute une carte à la collection
	public void piocher(Carte carte) {
		int i = 0;
		while ((i < nombreCartes) && (cartes[i] != null)) {
		i++;
		}
		if (i < nombreCartes) {
		cartes[i] = carte;
		} else {
		System.out.println("Nombre maximal de cartes atteint");
		}
		}
		public void afficher() {
		for (int i = 0; i < nombreCartes; ++i) {
		if (cartes[i] != null) {
		cartes[i].afficher();
		}
		}
	}
	
	
}
