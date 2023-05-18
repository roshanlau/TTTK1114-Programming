import java.util.*;
import java.text.DecimalFormat;

public class Final {

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
		
		int col = 1;
		double[] sumCol = new double [5];
		String day = null;
		
		for(int i = 0; i < 5; i++){    
			for(int j = 0; j < N; j++){    
				sumCol[i] += arr[j][i];    
			}
		}
		
		double maxCol = sumCol[0];
		
		for(int i =0; i< sumCol.length; i++) {
			if(sumCol[i]>maxCol) {
				maxCol = sumCol[i];
				col = i+1;
			}
		}
		
		switch(col){
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			default:
				break;	
		}
		
		System.out.println(day);
		
		double[] sumRow = new double[arr.length];
		for(int i = 0; i < arr.length; i++){     
			for(int j = 0; j < arr[0].length; j++){    
				sumRow[i] += arr[i][j];    
			}    
		}
		
		double maxRow = sumRow[0];
		int row = 0;
		
		for(int i =0; i< sumRow.length; i++) {
			if(sumRow[i]>maxRow) {
				maxRow = sumRow[i];
				row = i+1;
			}
		}
		
		System.out.println("Salesman " + row);
		
//		int row = sc.nextInt();
//		double sumRow = 0;
//		for(int i =0; i<5; i++) {
//			sumRow += arr[row - 1][i];
//		}
//		
//		System.out.println("Salesman " + row + ": RM" + df.format(sumRow));
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
