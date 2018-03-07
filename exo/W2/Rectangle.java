class Rectangle {
	
	
private double largeur;
private double longueur;

public Rectangle(double uneLargeur, double uneLongueur){

	largeur = uneLargeur;
	longueur = uneLongueur;
}

	public double surface() {
		return largeur * longueur;
	}
}
