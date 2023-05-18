import java.util.Stack;

public class plateInStack {
	
	public static void main(String[] args) {
		Stack<String>plate = new Stack<>();
		plate.push("Red");
		plate.push("Blue");
		plate.push("Yellow");
		plate.push("Purple");
		String p1 = plate.peek();
		plate.push("Orange");
		plate.push("Light " + p1);
		plate.pop();
		p1 = plate.peek();
	}
}
