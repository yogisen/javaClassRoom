
public class suite1 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 9; ++i) {
			System.out.print(i);
			}
			System.out.println("  for 1");
			
			
			for (int j = 1 ; j <= 9; ++j) {
				for (int i = 1; i <= 9; ++i) {
				System.out.print(i);
				}
				System.out.println(" test");
				}
				System.out.println("test2");
				
				for (int j = 1; j <= 9; ++j) {
					for (int i = 1; i <= j; ++i) { // la boucle va de 1 a j !!
					System.out.print(i);
					}
					System.out.println("");
					}
					System.out.println();
					
					
					for (int j = 1; j <= 9; ++j) {
						for (int i = 1; i <= (9-j); ++i) {
						System.out.print(" ");
						}
						for (int i = 1; i <= j; ++i) {
						System.out.print(i);
						}
						System.out.println();
						}
						System.out.println();		
					
					

		}
	}

