import java.util.*;
import java.text.DecimalFormat;


public class CirlceApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double radius;

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			Circle myCircle = new Circle(); // create Circle object
			radius = sc.nextDouble();
			myCircle.setRadius(radius); // sets radius 
			System.out.println("Case #" + i + ": " + df.format(myCircle.getRadius()) +
					" " + df.format( myCircle.getArea()) + " " + df.format(myCircle.getCircumference()));
		}

	}

}
