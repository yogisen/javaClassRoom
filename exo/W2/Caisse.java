import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

class Caisse {

	private int numero;
	private double total;

	public Caisse(int numero, double total) {
		this.numero = numero;
		this.total = total;
	}

	public void totalCaisse() {
		// printf permet de formatter l'affichage (par exemple pour avoir
		// 2 décimale seulement après la virgule)
		// %c signifie que l'argument 'numero' a pour format d'affichage
		// celui d'une chaine de caracteres
		// %.2f signifie que l'argument 'total' a pour format d'affichage
		// une valeur réelle avec 2 décimales après la virgule
		// %n signfie: saut de ligne
		System.out.printf("La caisse numero %c a encaisse %.2f Frs aujourd'hui%n" , numero, total);
	}

	public void scanner(Caddie caddie) {
		System.out.println("=========================================");

		// Affichage de la date courante
		Date dateCourante = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
		System.out.println(formatDate.format(dateCourante));
		
		System.out.println("Caisse numéro " + numero);
		System.out.println();

		int nbAchat = caddie.getNbAchats();
		double montantTotal = 0;
		
		for (int i = 0; i < nbAchat; i++) {
			Achat achat = caddie.getAchat(i);
			double prix = achat.getPrix();
			achat.affiche();
			montantTotal += prix;
			total += prix;
		}

		System.out.println();
		System.out.println("Montant a payer : " + montantTotal + " Frs");
		System.out.println("=========================================");
	}

}