import java.util.*;

public class Tutor1Q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount of water in kilogram: ");
		double water = s.nextDouble();
		System.out.println("Enter Initial Temperature: ");
		double iTemp = s.nextDouble();
		System.out.println("Enter Final Temperature: ");
		double fTemp = s.nextDouble();

		double Q = water * (fTemp - iTemp) * 4148;

		System.out.println(Q + "J");

	}

}
