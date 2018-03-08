class Banque2 {
	
	public static void main(String[] args) {
// Variables locales pour les taux d'intérets (afin d'éviter de
// répéter les mêmes chiffres pour chaque client):
		
		double taux1 = 0.01;
		double taux2 = 0.02;

// Construction des deux clients:
		
		Client c1 = new Client("test", "Genève", taux1, 1000.0, taux2, 2000.0);
		Client c2 = new Client("Alexandra", "Lausanne", taux1, 3000.0, taux2, 4000.0);
		System.out.println("Donnees avant le bouclement des comptes:");

		c1.afficher();
		c2.afficher();

// Bouclement des comptes des deux clients:
		c1.boucler();
		c2.boucler();

		System.out.println("Donnees apres le bouclement des comptes:");
		c1.afficher();
		c2.afficher();

	}
}