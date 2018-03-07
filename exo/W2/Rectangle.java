class Rectangle {

	private double largeur;
	private double longueur;

	public Rectangle(double uneLargeur, double uneLongueur){
		largeur = uneLargeur;
		longueur = uneLongueur;
		}
	
		public double surface() {
			return largeur * longueur;
										}
		public double getLongueur() {
			return longueur;
}
		public double getLargeur() {
			return largeur;
}
		public void setLargeur(double l) {
			if (l < 0) {
					l = -l;
								}
			largeur = l;
}
		public void setLongueur(double l) {
			if (l < 0) {
				l = -l;
			}
			longueur = l;
		}
}
