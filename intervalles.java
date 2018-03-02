import java.util.Scanner;
public class intervalles {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une valeur :");

		int x = clavier.nextInt();
		
		// I = [2,3[ U ]0,1] U [-10,-2]
		
		//if (x==2,3) || (x == 0,1) || (-10=>,-2=<) {
			
			//System.out.println("x est dans l'intervalle");
		//} else {
			//System.out.println("x n'est pas dans l'intervalle);
		if ((!(x < 2.0) && (x < 3.0))
				|| (!(x < 0.0) && !(x == 0.0) && ((x < 1.0) || (x == 1.0)))
				|| (!(x < -10.0) && ((x < -2.0) || (x == -2.0)))) {
				System.out.println("x appartient a I") ;
				} else {
				System.out.println("x n'appartient pas a I");
				}

	
	}
	}


