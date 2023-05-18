import java.util.*;

public class BalanceSymbolChecker{
	static void isBalanced(String expr) {
		Stack<Character> stack = new Stack<Character>();

		boolean checker = false;
		
		StringTokenizer st = new StringTokenizer(expr);
		StringTokenizer check = new StringTokenizer(expr);
		
		while(check.hasMoreElements()) {
		    if( check.nextToken().equals(";"))
		    	checker = true;
		}
		
		if(checker) {
			while (st.hasMoreTokens()) {
				String c = st.nextToken();
				char ch = c.charAt(0);

				if(ch != ';') {
					if (ch == '(' || ch == '[' || ch == '{') {
						stack.push(ch);
					}
					else {
						if (ch == ')') {
							if (stack.isEmpty()) {
								System.out.println("Unbalanced");
								return;
							}
							char p = stack.pop();
							if (p == '{' || p == '[') {
								System.out.println("Unbalanced");
								return;
							}
						} else if (ch == '}') {
							if (stack.isEmpty()) {
								System.out.println("Unbalanced");
								return;
							}
							char p = stack.pop();
							if (p == '(' || p == '[') {
								System.out.println("Unbalanced");
								return;
							}
						} else if (ch == ']') {

							if (stack.isEmpty()) {
								System.out.println("Unbalanced");
								return;
							}
							char p = stack.pop();
							if (p == '{' || p == '(') {
								System.out.println("Unbalanced");
								return;
							}
						}
					}

				}else {
					break;
				}
			}             
			if (stack.isEmpty())
				System.out.println("Balanced");
			else
				System.out.println("Unbalanced");
		}else {
			System.out.print("ERROR: no END OF STRING in the expression");
		}
		
	}

	public static void main(String[] args) {
		String expression;
		Scanner sc = new Scanner(System.in);
		expression = sc.nextLine();
		isBalanced(expression);
	}
}