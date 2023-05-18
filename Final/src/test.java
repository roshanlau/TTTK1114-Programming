import java.util.*;

public class test {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		
		for(int i = 1; i<=10; i+=2) {
			myStack.push(i);
			
		}
		System.out.println("Final myStack: " + myStack);
		
		System.out.println("myStack elements: " );
		while(!myStack.empty()) {
			System.out.print(myStack.peek() + " ");
			myStack.pop();
		}
	}
}
