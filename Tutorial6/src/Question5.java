import java.util.Stack;

public class Question5 {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("happy");
		st.push("sad");
		st.push("numb");
		st.push("saddle");
		st.pop();
		st.pop();
		st.push("numb");
	}
}
