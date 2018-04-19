import java.util.Scanner;
/**
 * Classe principale
 */
class Puissance4 {
	protected static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entrez votre nom: ");
    String nom = scanner.nextLine();
    System.out.println("--");

    Partie p = new Partie(new Ordinateur(Jeu.BLEU), new Humain(nom, Jeu.ROUGE));
    p.joue();
  }
}
