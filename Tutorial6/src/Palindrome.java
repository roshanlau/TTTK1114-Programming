import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Stack<Character> stStr = new Stack<Character>();
		Queue<Character> quStr = new Queue<Character>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			boolean check = true;
			
			String str = sc.next();
			
			for(int j = 0; j < str.length(); j++) {
				stStr.push(str.charAt(j));
				quStr.enqueue(str.charAt(j));
			}
			
			while(!stStr.empty()) {
				if(stStr.pop().equals(quStr.dequeue())) {
					continue;
				}else {
					check = false;
					continue;
				}
			}
			
			if(check) {
				System.out.println("It is a Palindrome");
			}else {
				System.out.println("Not a palindrome");
			}
		}
	}

}
