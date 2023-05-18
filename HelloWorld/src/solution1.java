import java.text.DecimalFormat;
import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double [][] arr = new double [N][5];
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}
		
		double average = sum/(N*5);
		System.out.println(average);
		//sum for collum
		double[] sumCol = new double [5];
		double[] averageCol = new double [5];
		String day = null;
		
		for(int i = 0; i < 5; i++){    
			for(int j = 0; j < N; j++){    
				sumCol[i] += arr[j][i];    
			}
			averageCol[i] = sumCol[i]/N;
		}
		
		//sum for row
		double[] sumRow = new double[arr.length];
		double[] averageRow = new double [arr.length];
		for(int i = 0; i < arr.length; i++){     
			for(int j = 0; j < arr[0].length; j++){    
				sumRow[i] += arr[i][j];    
			}    
			averageRow[i] = sumRow[i]/5;
		}
		int countCol = 0;
		for(int i = 0; i < 5; i++){ 
			if(averageCol[i] > average) {
				countCol++;
			}
		}
		int countRow = 0;
		for(int i = 0; i < N; i++) {
			if(averageRow[i] > average) {
				countRow++;
			}
		}
		
		System.out.println(countCol + " day(s)");
		System.out.println(countRow + " person(s)");
	}

}
