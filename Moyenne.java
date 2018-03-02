import java.util.Scanner;

class Moyenne {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		
		// Demande le nombre d'étudiants à l'utilisateur
		int nombreEtudiants = 0;
		System.out.print("Donnez le nombre d'etudiants : ");
		nombreEtudiants = scanner.nextInt();
		double somme = 0.0;
		// Initialise un tableau pouvant contenir autant
		// de notes que d'étudiants
		double [] notes = new double[nombreEtudiants];
		// Lecture des notes
		for (int i=0; i < nombreEtudiants; i++) {
		System.out.print(" Note etudiant " + (i + 1) + " : " );
		// Stocke la note du ième étudiant
		// dans la ième case du tableau
		notes[i] = scanner.nextDouble();
		somme = somme + notes[i];
		}
		double moyenne = somme / nombreEtudiants;
		// Affichage des résultats
		System.out.println("Moyenne de classe : " + moyenne);
		System.out.println(" Etudiant : note (ecart a la moyenne)");
		for (int i = 0; i < nombreEtudiants; i++) {
		System.out.println( " " + i + " : " + notes[i] + " ("
		+ (notes[i] - moyenne) + ")");
		}	
	}
}