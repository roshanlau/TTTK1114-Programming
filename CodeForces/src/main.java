import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean[] level = new boolean[n];
		for(int i = 0; i < n; i++)
			level[i] = false;
		
		int x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			level[sc.nextInt() - 1] = true;
		}
		
		int y = sc.nextInt();
	
		for(int i = 0; i < y; i++) {
			level[sc.nextInt() - 1] = true;
		}
		
		boolean check = false;
		
		for(int i = 0; i < level.length; i++) {
			if(level[i]) {
				check = true; 
			}else {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println( "I become the guy.");
		}else {
			System.out.println("Oh, my keyboard!");
		}
	
			
		
	}
	

}
