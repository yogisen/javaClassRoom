import java.util.Calendar;
import java.util.ArrayList;

public class Direction {

	public static void main(String[] args) {
		
		Ecole epfl = new Ecole(5);
		epfl.add(new EtudiantRegulier("Gaston Peutimide", 2013, "SSC", 6.0));
        epfl.add(new EtudiantRegulier("Yvan Rattrapeur", 2011, "SSC", 2.5));
        epfl.add(new EtudiantEchange("Bjorn Borgue", 2012, "Informatique", "KTH"));
        epfl.add(new Enseignant("Mathieu Matheu", 1998, "LMEP", 10000, "Physique"));
        epfl.add(new  Secretaire("Sophie Scribona", 2005, "LMT", 5000));
        epfl.afficherStatistiques();
        epfl.afficherEPFLiens();
    
	}

}

class Ecole {
    private ArrayList<EPFLien> gens;

    public Ecole(int nbPersonne) {
        gens = new ArrayList<EPFLien>();
    }

    public void add(EPFLien personne)
        {
            if (personne != null)
            {
                gens.add(personne);
            }
        }
    
        /**
         * Cette méthode affiche l'ancienneté moyenne des personnes fréquentant  l'école
         * et le nombre d'étudiants parmi eux
         */
    public void afficherStatistiques() {
        int anneeCourante = Calendar.getInstance().get(Calendar.YEAR);
        int nbAnneesTotal = 0;
        int nbEtudiants = 0;
        for (EPFLien epflien : gens) {
            nbAnneesTotal = nbAnneesTotal + (anneeCourante - epflien.getAnnee());
            if (epflien.estEtudiant()){
                ++nbEtudiants;
            }
        }
        System.out.println("Parmi les " + gens.size() + " EPFLiens, " +
                nbEtudiants + " sont des etudiants.");
        double moyen = nbAnneesTotal;
        moyen /= gens.size();
        System.out.println("Ils sont ici depuis en moyenne " + moyen + " ans");
    }


    // Cette méthode affiche les caractéristiques des personnes fréquentant  l'école
    public void afficherEPFLiens() {
        System.out.println("Liste des EPFLiens: ");
        for (EPFLien epflien : gens)
            epflien.afficher();
    }
}