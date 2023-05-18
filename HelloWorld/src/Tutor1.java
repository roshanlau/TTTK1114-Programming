import java.util.*;

public class Tutor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, cols, sumRow, sumCol;
		int M = sc.nextInt();
		int N = sc.nextInt();

		// declare and create an array
		int[][] square = new int[M][N];
		// read an array

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				square[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
		rows = square.length;
		cols = square[0].length;

		// Calculates sum of each row of given matrix
		for (int i = 0; i < rows; i++) {
			sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow = sumRow + square[i][j];
			}
			System.out.println(sumRow);
		}

		// Calculates sum of each column of given matrix
//		for(int i = 0; i < cols; i++){    
//			sumCol = 0;    
//			for(int j = 0; j < rows; j++){    
//				sumCol = sumCol + square[j][i];    
//			}    
//			System.out.println(sumCol);    
//		}
	}
}