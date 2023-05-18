import java.util.*;


public class PostfixEvaluator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> st = new Stack<String>();
		
		String inStr = sc.nextLine();
		StringTokenizer input = new StringTokenizer(inStr);
		StringTokenizer check = new StringTokenizer(inStr);
		String lastToken = null;
		boolean checker = false;
		while(check.hasMoreElements()) {
		    lastToken = check.nextToken();
		    if(lastToken.equals(";"))
		    	checker = true;
		}
		if(checker) {
			while(input.hasMoreTokens()) {
				String nextT = input.nextToken();
				
				if(!nextT.equals(";")) {
					if(isOp(nextT)) {
						
						int val1 = Integer.parseInt(st.pop());
						
		                int val2 = Integer.parseInt(st.pop());
		           
		                if(nextT.equals("+")) {
		                	st.push(String.valueOf(val2+val1));
		                }else if(nextT.equals("-")) {
		                	st.push(String.valueOf(val2-val1));
		                }else if(nextT.equals("*")) {
		                	st.push(String.valueOf(val2*val1));
		                }else if(nextT.equals("/")) {
		                	st.push(String.valueOf(val2/val1));
		                }
					}else {
						st.push(nextT);
						
					}
					
				}else {
					break;
				}
				
			}
			System.out.print(st.pop());
		}else {
			System.out.print("ERROR: no END OF STRING in the expression");
		}
		
		

	}
	
	public static boolean isOp(String in) {
		if(in.equals("+") || in.equals("-") || in.equals("/") || in.equals("*")) {
			return true;
		}else {
			return false;
		}
	}

}
