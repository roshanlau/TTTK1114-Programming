import java.util.*;

public class AddMatric {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();

		int A[][] = new int[M][N];
		int B[][] = new int[M][N];
		int C[][] = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				B[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
