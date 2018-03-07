class Assistant {
/* l'assistant mémorise dans son cerveau les valeurs lues
* et le resultat du calcul.
*/
private int ageLu;
private int argentLu;
private int resultat;
public void lire(Papier billet) {
System.out.println("[Assistant] (je lis le papier)");
ageLu = billet.lireAge();
argentLu = billet.lireArgent();
}
public void calculer() {
System.out.println("[Assistant] (je calcule mentalement)");
resultat = ageLu * 2;
resultat += 5;
resultat *= 50;
resultat += argentLu;
resultat -= 365;
}
public int annoncer() {
System.out.println("[Assistant] J'annonce : " + resultat + " !" );
return resultat;
}
}