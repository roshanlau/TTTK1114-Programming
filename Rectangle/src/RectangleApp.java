import java.util.*;
import java.text.DecimalFormat;

public class RectangleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double width, height;
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			Rectangle myRect = new Rectangle();
			
			width = sc.nextDouble();
			myRect.setWidth(width);
			
			height = sc.nextDouble();
			myRect.setHeight(height);
			
			System.out.println("Case #" + i + ": " + df.format(myRect.getWidth()) + " " + df.format(myRect.getHeight()) + " " + df.format(myRect.getArea()) + " " + df.format(myRect.getPerimeter()));
		}
	}

}
