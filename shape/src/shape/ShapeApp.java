package shape;
import java.util.*;

public class ShapeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		String shape = sc.next();
				
		if(shape.equals("Rectangle")) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			Rectangle rec = new Rectangle(shape, width, height);
			rec.RectangleArea();
			rec.RectanglePerimeter();
			rec.displayInfo();
			
		}
		
		else if(shape.equals("Circle")) {
			int radius = sc.nextInt();
			Circle cir = new Circle(shape, radius);
			cir.CicleCircumference();
			cir.CircleArea();
			cir.displayInfo();
			
		}
		
		

	}

}
