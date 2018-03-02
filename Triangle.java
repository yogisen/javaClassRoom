import java.util.Scanner;
public class Triangle {

	
	private static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Entrez le nombre de lignes du triangle : ");
		int n = clavier.nextInt();
		for (int i = 0; i < n; ++i) {
		// ecrit les espaces avant le triangle
		for (int j = 1; j < n - i; ++j) {
		System.out.print(" ");
		}
		// ecrit les etoiles du triangle
		for (int j = 0; j < 2 * i + 1; ++j) {
		System.out.print("*");
		}
		// retour a la ligne
		System.out.println();

	}

	}
}