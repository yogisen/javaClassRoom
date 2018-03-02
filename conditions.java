import java.util.Scanner;
public class conditions {

	public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	
	
		System.out.println("saisir une valeur a:");
		int a = clavier.nextInt();
	
			if (a == 0) {
				System.out.println("le nbr est 0 et il est pair");
			} else {
				if (a < 0) {
					System.out.println("le nbr est negatif");
				} else {
					System.out.println("nbr positif");
				}
				
			}
		int reste = a % 2;
		if (reste == 0) {
			System.out.println("le chifre est pair");
		} else { 
			System.out.println("chiffre impair");
		}
		}

}
