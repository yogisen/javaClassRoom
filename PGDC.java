import java.util.Scanner;
public class PGDC {

	public static void main(String[] args) {
	
		Scanner clavier = new Scanner (System.in);
		
		System.out.println("saisir un nombre positif  ");
		int nb1 = clavier.nextInt();
		
		System.out.println("saisir un nombre positif  ");
		int nb2 = clavier.nextInt();
		
		// trouver le pluis grand diviseur possible 
		
		int a = nb1;
		int b = nb2;

		while (a != b) {
			if (a > b) {
			a = a - b;
			} else {
			b = b - a;
			}
			}
		
		System.out.println("Le plus grand diviseur commun de " + a );
		
		

	}

}
