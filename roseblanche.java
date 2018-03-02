import java.util.Scanner;
public class roseblanche {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		
		
		System.out.println("quel est la somme de depart");
		int depart = clavier.nextInt();
		
		int livre = depart*3/4;
		int reste = (depart - livre);
		int autre = reste/3;
		int nbcafe = autre/2;
		int nbinfo = autre/4;
		int nbmetro = autre/3;
		
		System.out.println("la somme pour les livres :"+livre);
		System.out.println("combien je peux me payer de café :"+nbcafe);
		System.out.println("magazine info :"+nbinfo);	
		System.out.println("ticket de metro :"+nbmetro);
		
		
		int rose = autre % 2 + autre % 4 + autre % 3+ reste%3; 
		System.out.println("je peux acheter : "+rose);
		System.out.println("rose");

	}

}
