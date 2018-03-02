
public class MaîtreAnimal {

	public static void main(String[] args) {
		
		String reactionAnimal;
		
		AnimalFamilier monAnimal = new AnimalFamilier();
		
		
		monAnimal.manger();
		
		reactionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(reactionAnimal);
	  
	    monAnimal.dormir();
	    
	    
	    
	    
	    Poisson monPetitPoisson = new Poisson();
	    reactionAnimal = monAnimal.dire("je suis un poisson !!");
	    System.out.println(reactionAnimal);
	    
	    monPetitPoisson.dormir();
	    
	    Poisson monPoisson = new Poisson();
		
	    monPoisson.plonger(2);
	    monPoisson.plonger(3);
			
	    monPoisson.dormir();

	    
	    
		

	}

}
