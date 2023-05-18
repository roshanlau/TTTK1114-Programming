import java.util.Scanner;

public class CelsiusToFahrenheitConverter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter in Celsius: ");
		float c = s.nextFloat();
		float f = c * 9 / 5 + 32;
		System.out.println("Result in Fahrenheit: " + f);

	}

}
