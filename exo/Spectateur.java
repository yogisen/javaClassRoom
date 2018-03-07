import java.util.Scanner;

class Spectateur {
	// pour le moment a prendre comme tel (vu dans le MOOC précédent)
	// nous y reviendrons dans ce cours:

	private final static Scanner clavier = new Scanner(System.in);
	// Les spécificités du spectateur
	private int age;
	private int argent;
	// lorsqu'il entre dans la salle (avant il n'existe pas pour nous)

	public void arriver() {
		System.out.println("[Spectateur] (j'entre en scène)");
		System.out.print("Quel âge ai-je ? ");
		age = clavier.nextInt();
			do {
				System.out.print("Combien d'argent ai-je en poche (<100) ? ");
				argent = clavier.nextInt();
				} while (argent >= 100);
			System.out.println("[Spectateur] (j'ai un montant qui convient)");
}
	
/* Dans cette modélisation on suppose que le papier
n'appartient à personne : il a été par exemple trouvé
dans la salle de spectacle
*/
// écrit sur un papier
	
		public void ecrire(Papier billet) {
			System.out.println("[Spectateur] (j'écris le papier)");
			billet.ecrire(age, argent);
}
}
