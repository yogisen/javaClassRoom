import java.awt.Rectangle;

public class ToStringEq {

	public static void main(String[] args) {

		System.out.println("Test 1:");
		Rectangle rect = new Rectangle(12.5, 4.0);
		System.out.println(rect);
		System.out.println();
		
		System.out.print("test 2: ");
		Rectangle rect1 = new RectangleColore(12.5, 4.0, "rouge");
		System.out.println(rect1);
		System.out.println();
		
		System.out.print("test 3: ");
		Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2,new String ("rouge"));
		System.out.println(rect2);
		
		
		System.out.println(rect1.equals(rect2));
		System.out.println(rect2.equals(rect1));
		System.out.println(rect1.equals(null));
		System.out.println(rect.equals(rect1));
		System.out.println(rect1.equals(rect));
	}

}
