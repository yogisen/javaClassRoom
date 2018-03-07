// un bout de papier... pour ce tour de magie
class Papier {
// les données sur le papier
private int age;
private int argent;
// on peut écrire sur le papier
public void ecrire(int unAge, int unMontant) {
age = unAge;
argent = unMontant;
}
// et on peu lire les données depuis le papier
public int lireAge() { return age ; }
public int lireArgent() { return argent; }
}