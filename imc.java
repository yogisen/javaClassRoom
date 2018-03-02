
public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double poids = 114.1;
		double taille = 1.86;
		
		double imc = poids / (taille * taille );
		
		System.out.println("pour "+poids+""
				+ " KG et une taille de" 
				+taille+" +IMC est de"
		+imc);
	}

}
