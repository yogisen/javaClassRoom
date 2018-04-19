
public class Secretaire extends Personnel {
	public Secretaire (String nom, int annee, String labo, int salaire) {
		super(nom, annee, labo, salaire);
	}
	 


	public void afficher() {
		System.out.println("secretaire:");
		super.afficher();
	}
}