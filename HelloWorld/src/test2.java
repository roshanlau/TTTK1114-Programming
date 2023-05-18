import java.util.*;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		int numThree = sc.nextInt();

		System.out.print("The maximum is " + maxNumber(numOne, numTwo, numThree));
	}

	public static int maxNumber(int a, int b, int c) {
		// define here
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		}
	}

}
