import java.util.Scanner; 
public class afficheJoue 

//=====================AFFICHE JOUE CHANGE DE JOUEUR+++++++++++================================
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
	
		do {
			if (couleurJoueur == JAUNE) {
				System.out.print(" joueur X");
			} else {
				System.out.print("joueur 2");
		}
		int colonne = clavier.nextInt();
		--colonne;
		
		boolean valide = joue(grille,colonne,couleurJoueur);
		if (!valide) {
			System.out.print("coup non valide");
		}
		affiche(grille);
		//on change de joueur
		if(couleurJoueur == JAUNE) {
			couleurJoueur = ROUGE;
		}else {
			couleurJoueur=JAUNE;
		}
		} while(true);
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
	
	
//===============================AFFICHAGE=======================================================
	//affiche O pour joueur ROUGE X JAUNE
	
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
		//si le numero de colonne n'est pas bon, le coup n'est pas valide
		if (colonne >= grille[0].length) {
			return false;
		}
		//on cherche une case vide en partant du bas &&verif if pleine
	int ligne = grille.length - 1;
		
	boolean pleine = false;	
	while ((!pleine) && (grille[ligne][colonne] !=VIDE)) {
		if (ligne == 0) {
			pleine = true;
		}else {
			--ligne;
		}
	}
	//on remplit la case vide trouvée sinon coup impossible
	if (!pleine) {
		grille[ligne][colonne] = couleur;
		return true;
	} else {
		return false;
	}
	}
	//==================================demande et joue =======================================
	
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
}

	