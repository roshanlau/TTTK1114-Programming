import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner abc= new Scanner (System.in);
		int x =abc.nextInt();
		
		
		for (int i=0;i<x;i++) {
		
				long S =abc.nextLong();
					if (S>99) {
						long N=(10*S)/9;
		
						if (N%2==0) {
							System.out.print(N-1 + " " + N);
			
						}
						else
							System.out.println(N);
					}
		}
			
	}

}
