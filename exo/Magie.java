import java.util.Scanner;

	class Magie  {
		
// L'histoire générale :
public static void main(String[] args) {

		Spectateur thorin = new Spectateur(); // Il était une fois un spectateur...
		thorin.arriver(); // ...qui venait voir un spectacle (!!)...
		Magicien gandalf = new Magicien(); // ...où un magicien...
		Assistant bilbo = new Assistant(); // ...et son assistant...
		gandalf.tourDeMagie(bilbo, thorin); // ...lui firent un tour fantastique
	}
}