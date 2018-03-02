import java.util.Scanner;
public class Permutation {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
				
		System.out.println("entrez une valeur a : ");
		int a = clavier.nextInt();
		System.out.println("entrez une valeur b : ");
		int b = clavier.nextInt();
		
		int tmp =a;
		a = b;
		b =tmp;	
		
		
		System.out.println("les valeurs inversé de a est:"+a);
		System.out.println("b ="+b);
		
		
		
		
		
		
	}

}
