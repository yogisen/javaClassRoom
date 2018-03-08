class Compte {
	
	private double taux;
	private double solde;
	public Compte(double taux, double solde) {

		this.taux = taux;
		this.solde = solde;
}

	public double getSolde() {
		return solde;
}
	public void boucler() {
// Cette méthode ajoute les intérets au solde
		double interets = taux * solde;
			solde = solde + interets;
	}
}
