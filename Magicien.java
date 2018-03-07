
class Magicien {
	
// ce que le magicien doit deviner:
private int ageDevine;
private int argentDevine;

// pour faire son tour, le magicien a besoin d'au moins
// un spectateur et d'un assistant
	
	public void tourDeMagie(Assistant fidele, Spectateur quidam) {
		Papier billet = new Papier();
			System.out.println("[Magicien] un petit tour de magie...");

// le magicien donne ses instructions :
			
			quidam.ecrire(billet);
			fidele.lire(billet);
			fidele.calculer();
			calculer(fidele.annoncer());
			annoncer();

}

// partie privée ici car seul le magicien sait ce qu'il doit
// faire dans son tour
	private void calculer(int resultatRecu) {
		resultatRecu += 115;
		ageDevine = resultatRecu / 100;
		argentDevine = resultatRecu % 100;
	}
	private void annoncer() {
		System.out.println("[Magicien] "
				+ " - hum... je vois que vous êtes agé de "
				+ ageDevine + " ans ");
		System.out.println(" et que vous avez " + argentDevine + " francs suisses en poche !");
	}	
}