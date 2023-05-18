import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		String invert;
		String ans;
		Scanner sc = new Scanner(System.in);
		Stack<Character> wordStack = new Stack<Character>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			invert = "";
			String temp = sc.next();
			
			for(int j = 0; j < temp.length(); j++) {
				wordStack.push(temp.charAt(j));
			}
			for(int k = 0; k < temp.length(); k++) {
				invert += wordStack.pop();
			}
			
			if(temp.equals(invert)) {
				System.out.println("It is a Palindrome");
			}else {
				System.out.println("Not a Palindrome");
			}
		}
		
		
	}
}
