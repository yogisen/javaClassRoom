import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

class Article {

	private String nom;
	private double prix;
	private boolean action;

	public Article(String nom, double prix, boolean action) {
		this.nom = nom;
		this.prix = prix;
		this.action = action;
	}

	public double getPrix() {
		return prix;
	}

	public String getNom() {
		return nom;
	}

	public boolean estEnAction() {
		return action;
	}

}
