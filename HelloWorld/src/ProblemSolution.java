
// add header 1 for scanner (a)
import java.util.*;
// add header 2 for decimal (b)
import java.text.DecimalFormat;

public class ProblemSolution {
	public static void main(String[] args) {
		// add Scanner class (c)
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				// read input for element in array 2D name vote (f)
				arr[i][j] = sc.nextInt();
			}
		}
		int total = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				// Condition for principal
				// diagonal
				if (i == j)
					total += arr[i][j];

				// Condition for secondary
				// diagonal
				if ((i + j) == (N - 1))
					total += arr[i][j];
			}
		}
		if (N % 2 == 1)
			total = total - arr[N / 2][N / 2];

		System.out.println(total);
		// int minValue = arr[0][0];
		// for (int j = 0; j < arr.length; j++) {
		// for (int i = 0; i < arr[j].length; i++) {
		// if (arr[j][i] < minValue ) {
		// minValue = arr[j][i];
		// }
		// }
		// }
		//
		// System.out.println(minValue);

	}
}
