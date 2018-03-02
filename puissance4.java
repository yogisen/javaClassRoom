import java.util.Scanner; 
public class puissance4 

{
	private static Scanner clavier = new Scanner(System.in);
	private final static int VIDE  =  0;
	private final static int JAUNE =  1;
	private final static int ROUGE =  2;
	
	public static void main(String[] args)
	
	{
		
		int[][] grille = new int[6][7];
		initialise(grille);
		affiche(grille);
		int couleurJoueur = JAUNE;
		
		boolean gagne;
		
		do {
			demandeEtJoue(grille, couleurJoueur);
		
			affiche(grille);
		
			gagne = estCeGagne(grille, couleurJoueur);
		// on change la couleur pour la couleur de l'autre joueur:
		if (couleurJoueur == JAUNE) {
		couleurJoueur = ROUGE;
		} else {
		couleurJoueur = JAUNE;
		}
		} while(!gagne);

			
	}
//=====================CREER LA GRILLE=========================================================	
	static void initialise(int[][]grille)
	{
		for(int i = 0 ; i < grille.length; ++i) {
			for(int j = 0; j < grille[i].length; ++j) {
				grille[i][j] = VIDE;
			}
		}
	}
	//affiche 0 pour une case rouge, X pour une case jaune
	
//===============================AFFICHAGE=======================================================
	
	static void affiche (int[][] grille)
	{
		for (int[] ligne : grille) {
			System.out.print(" |");
			for (int cellule : ligne) {
				if (cellule == VIDE) {
					System.out.print(' ');
			} else if  (cellule == ROUGE) {
				System.out.print('O');
			} else  {
				System.out.print('X');
			}
			System.out.print('|');
			}
			System.out.println();
		}
		System.out.print('=');
		for(int i = 1; i <= grille[0].length; ++i){
			System.out.print("=" +i);
		}		
		System.out.println("==\n");
	}
	//===================JOUE METHOD 3 ======================================================
	
	static boolean joue (int[][]grille, int colonne, int couleur)
	{
		if (colonne >= grille[0].length) {
			return false;
		}
		int ligne = grille.length - 1;
	//on cherche une case vide en partant du bas
	
	boolean pleine = false;	
	while ((!pleine) && (grille[ligne][colonne] !=VIDE)) {
		if (ligne == 0) {
			pleine = true;
		}else {
			--ligne;
		}
	}
	
	if (!pleine) {
		grille[ligne][colonne] = couleur;
		return true;
	} else {
		return false;
	}
	}
	
	//==================================demande et joue =======================================
/*	
	 static void demandeEtJoue(int[][]grille, int couleurJoueur)
	{
		boolean valide;
		
		do {
			
		System.out.println("joueur");
		if (couleurJoueur == JAUNE) {
			System.out.print("X le joueur JAUNE doit jouer");
		}else {
			System.out.print("O");
		}
		
		int colonne = clavier.nextInt();
		--colonne;
		//saisi joueur ! valeur tableau
		valide = joue(grille,colonne, couleurJoueur);
		if (!valide) {
			System.out.println("ce coup nest pas valide");
		}
	}while(!valide);

	}
*/
//===================COMPTE===================================
	/*
	static int compte(int[][]grille,
						int ligneDepart, int colonneDepart,
						int dirLigne, int dirColonne)
	{
		int compteur =0;
		int ligne = ligneDepart;
		int colonne = colonneDepart;
		
		while (grille[ligne][colonne] == grille[ligneDepart][colonneDepart] &&
				ligne >= 0 && ligne < grille.length &&
				colonne >=0 && colonne < grille[ligne].length) {
			++compteur;
			ligne = ligne +dirLigne;
		colonne = colonne + dirColonne;
	}
		return compteur;
	}
	*/
	//=========================================== gagne = estCeGagne(grille, couleurJoueur);
/*
		static boolean estCeGagne(int[][] grille, int couleurJoueur)
		{
			for(int ligne = 0; ligne < grille.length; ++ligne) {
				for(int colonne = 0; colonne < grille[ligne].length; ++colonne) {
					int couleurCase = grille[ligne][colonne];
		
					if (couleurCase == couleurJoueur) {
						if (
		// en diagonale, vers le haut et la droite:
		(compte(grille, ligne, colonne, -1, +1) >= 4) ||
		// horizontalement, vers la droite:
		(compte(grille, ligne, colonne, 0, +1) >= 4) ||
		// en diagonale, vers le bas et la droite:
		(compte(grille, ligne, colonne, +1, +1) >= 4) ||
		// verticalement, vers le bas:
		(compte(grille, ligne, colonne, +1, 0) >= 4)
		) {
		return true;
		}
		}
		}
		}
		return false;
		}
	*/	
}

	