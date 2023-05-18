import java.util.Stack;

public class stackProgram {

	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<String>();
		stack1.push("A");
		stack1.push("B");
		stack1.push("C");
		stack1.push("D");
		
		System.out.println("Top element is: " + stack1.peek());
		
		System.out.println("C is present at " + stack1.search("C") + " position from top");
		stack1.pop();
		stack1.pop();
		
		System.out.println("Stack size is " + stack1.size());
		
		if(stack1.empty()) 
			System.out.println("Stack is Empty");
		else
			System.out.println("Stack is not Empty");
	}

}
