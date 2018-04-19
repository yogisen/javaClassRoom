
public class Courrier {

	public double affranchirNormal () {return 0;	};
	
	//attributs
	private double poids;
	private boolean express;
	private String adresse;
	
	
	//constructeurs
	public Courrier (double poinds, boolean express, String adresse) {
		this.poids=poids;
		this.express=express;
		this.adresse=adresse;
		
	}
	
	public double getPoids () {
		return poids;
	}
	
	public double affranchir () {
		if (! valide())
		{
			return 0;
		}
		else 
		{
			double total = affranchirNormal();
			if (express) {
				total *=2;
			}
			return total;
		}
	}
	
	public boolean valide () {
		return adresse.length() >0;
	}


	public String toString() {
		String s= "";
		if (!valide())
		{
			s+= "(Courrier invalide\n";
		}
		s+= " Poids :" + poids + "grammes\n";
		s+= " Express :" + (express ?"oui" : "non") + "\n";
		s+= " Destination : " + adresse + "\n";
		s+= " Prix : " + affranchir() + " CHF\n";
		
		return s;
		
		
	}










}




















