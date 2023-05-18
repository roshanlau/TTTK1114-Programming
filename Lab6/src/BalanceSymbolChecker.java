import java.util.*;

public class BalanceSymbolChecker {
	
	static boolean isOp(String str) {
		if(str.equals("[") || str.equals("(") || str.equals("{")) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean isBalanced(String expr) {
		Stack<String> symbol = new Stack<String>();
		StringTokenizer input = new StringTokenizer(expr);

		String temp = input.nextToken();

		while(!temp.equals(";")) {
			if(isOp(temp)) {
				symbol.push(temp);
				temp = input.nextToken();
				continue;
			}
			System.out.print(symbol);
			if(symbol.isEmpty())
				return false;

			String check;

			if(temp.equals(")")) {
				check = symbol.pop();
				if(check.equals("{") || check.equals("[")) 
					return false;
				break;
			}else if(temp.equals("}")) {
				check = symbol.pop();
				if(check.equals("(") || check.equals("[")) 
					return false;
				break;
			}else if(temp.equals("]")) {
				check = symbol.pop();
				if(check.equals("(") || check.equals("{")) 
					return false;
				break;
			}

			if(!isOp(temp)) {
				temp = input.nextToken();
			}
		}

		return (symbol.isEmpty());
	}

	public static void main(String[] args) {

		String result = "";

		Scanner sc = new Scanner(System.in);
		boolean checker = false;
		
		String inStr = sc.nextLine();
		
		StringTokenizer check = new StringTokenizer(inStr);
		
		while(check.hasMoreElements()) {
		    if(check.nextToken().equals(";"))
		    	checker = true;
		}
		
		if(checker) {
			if(isBalanced(inStr))
				result = "Balanced";
			else
				result = "Unbalanced";
			System.out.print(result);
		}else {
			System.out.print("ERROR: no END OF STRING in the expression");
		}
		
	
	}

}
