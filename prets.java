import java.util.Scanner;

public class prets {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//paye (en plus) un intérêt variable i = ir * S
		//S= somme restant à rembourser (avant déduction du remboursement mensuel)
		
		int SO = 0; // pret de la banque S0
						
		do {
			System.out.print("pret de la banque (100 < pret) : ");
			  SO = scanner.nextInt();
			} while (SO < 100);
		
		int r = 0; //rembourse chaque mois un montant fixe r
		do {
			System.out.print("remboursement : (0 <= pret) : ");
			  r = scanner.nextInt();
			} while (r <= 0);
		
		double ir = 0.0; // ir = taux fixe
		do {
		System.out.print("Taux d'intérêt en % (0 < tx < 100) : ");
		ir = scanner.nextDouble();
		} while ( (ir <= 0.0) || (ir >= 100.0) );
		ir /= 100.00;
		
		double cumul = 0.0; // somme des intérêts (cumulés)
		double s = SO; // somme restant à rembourser
		int nbr = 0; // nombre de remboursements
		while (s > 0.0) {
		++nbr;
		cumul = cumul + ir * s;
		s = s - r;
		System.out.println(nbr + ": s=" + s + ", cumul=" + cumul);
		}
		System.out.println("Somme des intérêts encaissés : " + cumul
		+ " (sur " + nbr + " mois).");
		
		
		
		

	}

}
