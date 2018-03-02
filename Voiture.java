
public class Voiture {

    public void demarrer(){
        System.out.println("Je demarre !!!");
    }
    
    public void arreter(){
        System.out.println("Je m'arrete !!!");
    }
    
    public int rouler(int duree){
        int distance = duree * 60;
        System.out.println("Je roule sur une distance de "+distance+" .");
        return distance;
    }
    
}