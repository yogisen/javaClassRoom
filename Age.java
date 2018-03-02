import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int age = 20;
		int today = 2018;
		
		
		System.out.println("Quel age avez vous : ");
		age = scanner.nextInt();
		
		int annee = today-age;
		
		System.out.println("Votre annee de naissance est :"+annee);
		
		

	}

}
