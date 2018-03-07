	class ManipRectangle {
		
		public static void main(String[] args) {
			
			Rectangle rect = new Rectangle(1.5, 12.8);
			System.out.println("Surface : " + rect.surface());

			rect.largeur = 3.2;
			rect.longueur = 6.9;
			System.out.println("Surface : " + rect.surface());
		}
}
	
	//Supposons maintenant que nous souhaitions modifier les valeurs des attributs dans le programme principal: