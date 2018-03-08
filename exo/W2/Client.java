class Client {
	
	private String nom;
	private String ville;
	private Compte cpt1;
	private Compte cpt2;
	public Client(String nom, String ville, double taux1, double solde1,

			double taux2, double solde2) {
				this.nom = nom;
				this.ville = ville;
				
				// Construction d'un compte privé:
				cpt1 = new Compte(taux1, solde1);
				// Construction d'un compte d'épargne:
				cpt2 = new Compte(taux2, solde2);
}
	
		public void afficher() {
// Cette méthode affiche les données du client
		System.out.println(" Client " + nom + " de " + ville);
		System.out.println(" Compte prive: "
				+ cpt1.getSolde() + " francs");
		System.out.println(" Compte d'epargne: "
				+ cpt2.getSolde() + " francs");

}
		public void boucler() {
// Cette méthode boucle les deux comptes du client
	cpt1.boucler();
	cpt2.boucler();
		}
}