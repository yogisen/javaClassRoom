public class ProprietaireVoiture {

    public static void main(String[] args) {
        // Cette variable gardera une trace de la distance totale parcourue.
        int distanceTotale = 0;

        // C'est ici que j'instancie la variable de type Voiture, qui sera testee.
        // VoitureJamesBond maVoiture = new VoitureJamesBond();
        // VoitureJamesBond maVoiture = new VoitureJamesBond();
         Voiture maVoiture = new Voiture();

        
        // Les appels des methodes sur la variable maVoiture.
        maVoiture.demarrer();
        distanceTotale = distanceTotale + maVoiture.rouler(10);
        distanceTotale = distanceTotale + maVoiture.rouler(30);
        maVoiture.arreter();
        
        // Affichage ecran final (compte-rendu)
        System.out.println("Distance totale parcourue : "+distanceTotale +" .");
    }

}