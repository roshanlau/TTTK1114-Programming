import java.util.*;

public class solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer>st = new Stack<Integer>();
		
		int num = sc.nextInt();
		
		while(num != 0) {
			st.add(num%7);
			num = num / 7;
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}

	}

}
