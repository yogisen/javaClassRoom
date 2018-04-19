
public class EtudiantRegulier extends Etudiant {
	private double moyenne;
	
	public EtudiantRegulier (String nom, int annee, String section, double moyenne) {
		super(nom, annee, section);
		this.moyenne = moyenne;
	}
	
	public void afficher() {
		System.out.print("Etudiant regulier :");
		super.afficher();
		System.out.println(" Moyenne : " + moyenne);
	}
}
