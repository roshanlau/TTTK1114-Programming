import java.util.*;


public class ShapeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Shape[] shape = {new Triangle(n, m),new Rectangle(n, m)};
		
		shape[0].calculateArea();
		shape[1].calculateArea();
	
	}
	
}
