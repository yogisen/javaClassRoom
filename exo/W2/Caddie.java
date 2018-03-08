import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

class Caddie {
	// Ce corrigé vous permet de voir un exemple d'utilisation
	// des tableaux dynamiques (juste entrevus en cours)
	// Les tableaux de ce type peuvent avoir une taille qui
	// augmente ou diminue en cours d'exécution (il n'est pas nécessaire
	// de fixer une taille à la création du tableau)

	// listeAchats est un tableau dynamique d'Achats
	private ArrayList<Achat> listeAchats;

	public Caddie() {
		// le constructeur du tableau dynamique est invoqué
		// pour créer le tableau (qui est vide de contenu au départ)
		this.listeAchats = new ArrayList<Achat>();
	}

	public void remplir(Article article, int quantite) {
		Achat achat = new Achat(article, quantite);

		// la méthode add des ArrayList permet de
		// leur ajouter dynamiquement des données en cours
		// d'exécution du programme.
		// la contrepartie de suppression (remove) existe aussi.
		listeAchats.add(achat);
	}

	public Achat getAchat(int index) {
		// l'accès au ieme élément d'un tableau
		// dynamique se fait par la méthode get
		return listeAchats.get(index);
	}

	public int getNbAchats() {
		// les tableaux dynamiques disposent d'une méthode size
		// retournant la taille du tableau
		return listeAchats.size();
	}

}

