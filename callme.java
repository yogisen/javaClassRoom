import java.util.Scanner;
public class callme {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("saisir une disponibilité ");
		int dispo = clavier.nextInt();
		
			
		if  ((dispo>0) && (dispo<=7)) 
			
	    	   System.out.println("on s'appelle dans la semaine");
						
			 else
				if (dispo >7 ) {
	    	   System.out.println("laisse romber et envoie moi Mail perso");

				}
	    	  
			while  (dispo<0) 
	    	   System.out.println("tu vas te prendre une boucle à vouloir me tester !");
			
			Repertoire contact = new Repertoire();
			
			contact.prenom = "selim" ;
			contact.number = 624359641;
			
			System.out.println(("Si besoin "+contact.prenom+" au 0"+contact.number));
			
			
			
	   		
			
			//do {
			//	System.out.println("Appel moi");
			//	  
			//	} while (dispo < 7);
			
			// System.out.println("tu n'es pas dispo cette semaine ...laisse tomber");
		
		
		
		}	

	}


