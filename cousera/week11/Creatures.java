class Creature extends Carte {
	
	private String nom;
	private int attaque;
	private int defense;

	public Creature(int cout, String nom, int attaque, int defense) {

		super(cout);
		this.nom = nom;
		this.attaque = attaque;
		this.defense = defense;

		System.out.println("Une nouvelle créature.");
		}

	
	public void afficher() {
		System.out.println("Une créature " + nom + " " + attaque + "/"+ defense + " ");
	
	}
}