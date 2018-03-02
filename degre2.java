import java.util.Scanner;

public class degre2 {

		
		private static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
	// tant que a est nul demander une valeur à l utilisateur
		
		while (a == 0.0) {
			System.out.println("merci de saisir une valeur a:");
			a = scanner.nextDouble();
		
		}
			System.out.println("valeur de b");
			b = scanner.nextDouble();
			System.out.println("valeur c");
			c = scanner.nextDouble();
			
			double delta = b * b - 4.0 * a * c;
			
if (delta < 0.0) {
	System.out.println("pas de solution");
} else if (delta >0.0) {
	System.out.println("Deux solutions : "
			+ (-b - Math.sqrt(delta)) / (2.0 * a)
			+ " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
} else {
System.out.println("Une solution unique : "
+ -b / (2.0 * a));
}


System.out.println("delta="+delta);

		
	
			
			
			
			
			


	}

}
