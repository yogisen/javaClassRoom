
public class Rectangle {
	
	double largeur;
	double longueur;
	
	/*
	Dotons notre classe d'une méthode constructeur construisant nos objets Rectangle et initialisant leurs attributs. Notez que le constructeur
	a le même nom que la classe, et que dans le programme principal la déclaration-initialisation d'un rectangle se fait en utilisant le
	constructeur.
	*/
	
	//Le constructeur
	public Rectangle(double uneLargeur, double uneLongueur) {
		// largeur et longueur sont les attributs
		// de la classe
		largeur = uneLargeur;
		longueur = uneLongueur;
	}
	// largeur et longueur sont les attributs
	// de la classe
	
	// La méthode pour le calcul de la surface
	public double surface () {
	return largeur * longueur;
	}
}
