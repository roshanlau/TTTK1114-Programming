import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProblemSolution2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declare and create an array
		int[][] square = new int[4][3];
		int[] sum = new int[4];
		// read an array

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				square[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				if (j == 0) {
					sum[i] += (square[i][j] * 3);
				} else if (j == 1) {
					sum[i] += square[i][j];
				}
			}
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + " ");
		}

		int max = sum[0];
		int row = 1;
		for (int i = 1; i < sum.length; i++) {
			if (max < sum[i]) {
				max = sum[i];
				row = i + 1;
			}
		}
		System.out.println(row);

//		int[] sum = new int [3];

//		for(int i = 0; i < square.length; i++) {
//			for(int j = 0; j < square[0].length; j++) {
//				sum[i] += square[j][i];
//			}
//		}
//		
//		int max = sum[0];
//		int col = 1;
//		for(int i = 1; i < sum.length; i++) {
//			if(max < sum[i]) {
//				max = sum[i];
//				col = i+1;
//			}
//		} 
//		System.out.println("Col " + col + " has the maximum sum of " + max);

//		for(int i = 1; i <= sum.length; i++) {
//			System.out.println("Sum for column " + i + " is " + sum[i-1]);
//		} 

//		for(int i = 0; i < square.length; i++) {
//			for(int j = 0; j < square[0].length; j++) {
//				System.out.print(square[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
}
