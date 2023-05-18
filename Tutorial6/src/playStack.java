import java.util.Stack;

public class playStack {
	public static void main(String[] args) {
		Stack<Integer>s = new Stack<Integer>();
		int n1, n2;
		s.push(15);
		s.push(8);
		n1 = s.peek() + 2;
		s.push(n1 + 6);
		n2 = s.peek();
		s.push(n1 + n2);
		n2 = s.peek();
		s.pop();
		s.push(13);
		n1 = s.peek();
		s.pop();
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
