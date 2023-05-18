import java.util.*;


public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> strStack = new Stack<String>();
		
		String inStr = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(inStr);
		while(st.hasMoreTokens()) {
			String nextT = st.nextToken();
			
			
			if(nextT.equals("-")) {
				System.out.print(strStack.pop() + " ");
			}else {
				strStack.push(nextT);
			}
			
			
		}
		
		System.out.print("(" + strStack.size() + " left on stack)");
	}
}
