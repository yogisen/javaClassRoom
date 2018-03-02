
public class MaîtrePoisson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Poisson monPoisson = new Poisson();
			
		    monPoisson.plonger(2);
		    

		    String réactionPoisson;
		    réactionPoisson = monPoisson.dire("Salut");
		    System.out.println(réactionPoisson);

				
		    monPoisson.dormir();
	}

}
