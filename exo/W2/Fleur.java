class Fleur {

	private String espece;
	private String couleur;
	
	public Fleur(String espece, String couleur) {
		
		this.espece = espece;
		this.couleur = couleur;
		
		System.out.println(espece + " fraichement cueillie");
}
	public Fleur(Fleur autre) {
		couleur = autre.couleur;
			System.out.print("Fragile corolle taillée ");
}
	
	public void eclore() { System.out.println("veiné de " + couleur); }
		public String toString() {
			return "qu'un simple souffle" ;

	}
}
