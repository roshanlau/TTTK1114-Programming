import java.util.Stack;

public class intStack {
	public static void main(String[] args) {
		Stack<Integer>stackOne = new Stack<Integer>();
		System.out.println(stackOne.empty());
		
		for(int i = 0; i<5; i++) 
			stackOne.push(new Integer(i*10));
			
		System.out.println(stackOne.peek());
		
		Stack<Integer> stackTwo = new Stack<Integer>();
		while(!stackOne.empty())
			stackTwo.push(stackOne.pop());
		
		System.out.println(stackTwo.peek());
		 
	}
}
