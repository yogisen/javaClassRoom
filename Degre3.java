import java.util.Scanner;

public class Degre3 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner (System.in);
		
		System.out.println("Entrez la valeur a : ");
		int a = clavier.nextInt();
		System.out.println("Entrez la valeur b : ");
		int b = clavier.nextInt();
		System.out.println("Entrez la valeur c:");
		int c = clavier.nextInt();
		System.out.println("entrez la valeur :x");
		double x = clavier.nextDouble();
		
		double xx= x*x;
		double aux = a+b;
		double resultat = aux/2*x*xx+aux*aux*xx+aux+c;
		System.out.println("la valeur de l'expression est : "+resultat);
		
		
		
	}

}
