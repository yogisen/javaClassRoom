
public class Rectangle {

	private double hauteur;
	private double largeur;
	
	public Rectangle ( double uneHauteur, double uneLargeur) 
		{
			largeur = uneLargeur;
			hauteur = uneHauteur;
		}
		public boolean equals(Object autreRect)
			{
				if (autreRect == null)
					return false;
				else
					//garantit que l on compare bien des objet de meme classe
					if (autreRect.getClass() != getClass()) {
						return false;
					} 
					else
					{
						return (
								// Ne pas oublier le transtypage ici
								(largeur == ((Rectangle)autreRect).largeur)
								&&
								hauteur == ((Rectangle)autreRect).hauteur);
								}
								}
								public String toString()
								{
								return "Rectangle : \n "
								+ "largeur = " + largeur + "\n hauteur = " + hauteur;
								}
								}