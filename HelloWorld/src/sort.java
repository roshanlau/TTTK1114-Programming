import java.util.*;
import java.text.DecimalFormat;

public class sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// add Decimal class with two decimal zero (d)
		DecimalFormat df = new DecimalFormat("0.00");
		int N = sc.nextInt();
		int x = 1;
		// declare array 2D name vote with size [N] [4] (e)
		int[][] vote = new int[N][4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < vote[0].length; j++) {
				// read input for element in array 2D name vote (f)
				vote[i][j] = sc.nextInt();
			}
		}
		for (int j = 0; j < vote[0].length; j++) {
			// initial total to zero (g)
			int total = 0;
			for (int i = 0; i < vote.length; i++) {
				// sum total with for each row (h)
				total += vote[i][j];
			}
			// calculate average of the total by divide with the N value (i)
			double ave = total / (double) N;
			System.out.println("Soda-" + (j + 1) + ": " + df.format(ave) + " ");
		}
	}

}
