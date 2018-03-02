import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		int base = 4;
		int nbConvives = 4;		
		double fromage = 800; 
		double eau = 2;
		double ail = 2.0;
		double pain = 400;
		
		System.out.println("Combien avez vous de convive ?");
		
		nbConvives = scanner.nextInt();
		//int nbConvives = clavier.nextInt();CORRECTION 
		
		
		double ratio = nbConvives;
		
		ratio /= base;
		fromage *= ratio;
		eau *= ratio;
		ail *= ratio;
		pain *= ratio;
	
		System.out.println("pour une fondue pour :" +nbConvives);
		System.out.println("il vous faudra ....: ");
		System.out.println(fromage+" gr de fromage");
		System.out.println( eau+ " Litre d'eau");
		System.out.println(ail+ " de gousse d 'ail");
		System.out.println(pain+ "gr de pain");
		
		

	}

}
