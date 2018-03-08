
class Poeme
{
	public static void main(String[] args) {
		
		Fleur f1 = new Fleur("Violette", "bleu");
		Fleur f2 = new Fleur(f1);
		Fleur f3 = new Fleur("rose", "verte");
		Fleur f4 = new Fleur(f3);


		
		System.out.print("dans un cristal ");
		
		
		f1.eclore();
		f2.eclore();
		f3.eclore();
		f4.eclore();

		
		System.out.print("ne laissant plus ");
		System.out.println(f1);
		System.out.println(f2);
		
	
	}
}