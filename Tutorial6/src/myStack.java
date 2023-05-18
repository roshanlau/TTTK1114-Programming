import java.util.Stack;

public class myStack {

	public static void main(String[] args) {
		Stack<Integer>myStack = new Stack<Integer>();
		int n = 12;
		while(n>0) {
			myStack.push(n%2);
			n = n/2;
		}
		String result = " ";
		while(!myStack.isEmpty()) 
			result += myStack.pop();
		System.out.println(result);
	}

}
