import java.util.*;

public class GeometryCalculator_Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int A[][] = new int[M][M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = s.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
//				if(i+j == M - 1 || i==j)
				sum = sum + A[i][j];
			}
		}
		System.out.println(sum);
//		int[][] arr = new int [3][1];
//		arr[0] = new int [1];
//		arr[1] = new int [2];
//		arr[2] = new int [3];
//		int sum = 0;
//		for(int i = 1; i<3; i++)
//			for(int j = 0; j<i+1; j++)
//				arr[i][j]=j+1;
//		for(int i = 0; i<3; i++)
//			for(int j = 0; j<i+1; j++)
//				sum+=arr[i][j]=j+1;
//		System.out.print(sum);
	}

}
