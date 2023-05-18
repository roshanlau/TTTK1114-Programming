import java.util.Scanner;

public class dying {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long j, check;
		int n = sc.nextInt();
		long[] arr = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			j = 2;
			check = 1;
			while (j < arr[i]) {
				if (arr[i] % j == 0 || arr[i] == 1) {
					check = 0;
					break;
				}
				j++;
			}
			if (check == 1) {
				if (arr[i] == 1) {
				} else {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}
