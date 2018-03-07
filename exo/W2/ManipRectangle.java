	class ManipRectangle {
public static void main(String[] args) {
Rectangle rect = new Rectangle(1.5,12.8);
System.out.println("Surface : " + rect.surface());
rect.setLargeur(3.2);
rect.setLongueur(6.9);
System.out.println("Surface : " + rect.surface());
}
}