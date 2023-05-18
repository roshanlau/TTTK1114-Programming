import java.util.Scanner;

public class quesd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




		Scanner sc=new Scanner(System.in);



		int N=sc.nextInt();
		float arr[]=new float[N];
		boolean check = true;

		for(int i=0;i<N;i++) {
			float X1=sc.nextFloat();
			float Y1=sc.nextFloat();
			float X2=sc.nextFloat();
			float Y2=sc.nextFloat();
			
			float m = (Y2-Y1)/(X2-X1);

			arr[i]= m;


		}
		
		for(int i=0;i<N;i++) {
			for(int j = i + 1; j < N; j++) {
				if(arr[i] == arr[j]) { 
					check = false;
					break;
				}
			}
		}
		System.out.println(check);
	}

}


