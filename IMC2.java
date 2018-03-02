import java.util.Scanner;

public class IMC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		double poids = 80.;
		double taille = 1.86;	
		
		System.out.println("Entrez un poids (en Kg) : ");
		poids = scanner.nextDouble();
		System.out.println("Entrez une taille (en M) : ");
		taille = scanner.nextDouble();
	
		
		double IMC2 = poids / (taille*taille);
		
		System.out.println("L IMC est de "+IMC2);
		
	}

}
