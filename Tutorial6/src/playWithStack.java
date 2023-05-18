import java.util.Stack;
import java.util.Scanner;

public class playWithStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String>strStack = new Stack<String>();
		int size, x;
		x = sc.nextInt();
		for(int i = 0; i<x; i++) {
			size = 0;
			String n = sc.next();
			while(!n.equals("#")) {
				strStack.push(n); size++;
				n = sc.next();
			}
			System.out.print(size + ": ");
			while(!strStack.empty()) {
				System.out.print(strStack.pop() + " ");
			}
		}
	}

}
