import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();
        
        //— 1 franc par heure si le vélo est loué entre 0h et 7h ou entre 17h et 24h;
        //— 2 francs par heure si le vélo est loué entre 7h et 17h.
        //l’heure du début de la location est toujours inférieure à l’heure de la fin de la location;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
       if  ((debut>0) && (debut<=24)) 
    	   System.out.println("Les heures doivent être comprises entre 0 et 24 !");
       if (debut==fin) 
    	   System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
       if (debut>fin)
    	   System.out.println("Bizarre, le début de la location est après la fin ...");
        
       int locationTarif1 = fin - debut;
      // si l heure est comprise entre 0 et 7 ou 17 et 24 alors appliquer le tarif1
       if ((debut >= 0 && debut <7) || (debut >= 17 && debut<= 24));
   	      	   
       
        System.out.println("Vous avez loué votre vélo pendant au tarif heures creuses : "+ locationTarif1);
        int locationTarif2 = fin - debut;
        if ( debut >= 7 &&  fin < 17)
        	
        System.out.println( " tarif 2 :" +locationTarif2);	
               
        		
         System.out.print("Le montant total à payer est de " );
        
        
        //System.out.println(" franc(s).");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
