import java.util.*;
public class Infix2PostfixConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		Stack<String> Stack1 = new Stack<String>();

		String temp = "";
		char symT = ' ';
		boolean checker = false;

		String infix = in.nextLine(); // input string
		StringTokenizer check = new StringTokenizer(infix);
		StringTokenizer st = new StringTokenizer(infix);

		while(check.hasMoreElements()) {
			if(check.nextToken().equals(";"))
				checker = true;
		}
		if(checker) {
			while (st.hasMoreTokens()) {
				String nextT = st.nextToken();
				if(nextT.equals(";")) {
					break;
				}
				if(!(nextT.equals(";"))) { 
					if (isOperator(nextT)){
						symT = atoc(nextT);

						// >>>>> add your code here <<<<<
						while(!Stack1.isEmpty() && isHigherThan(atoc(Stack1.peek()), symT)) {
							temp += (Stack1.pop() + " ");
						}
						Stack1.push(nextT);

					}
					else
						// >>>>> add your code here if meet operand <<<<<
						temp += (nextT + " ");

				}

			}
			// >>>>> add your code here <<<<<
			for (int i = 0; i <=Stack1.size() ; i++) {
				temp += (Stack1.pop() + " ");
			}
			System.out.println(temp);
		}else {
			System.out.print("ERROR: no END OF STRING in the expression");
		}

	} 



	static char atoc(String str) {
		char data1 = str.charAt(0);
		return data1;
	}
	static boolean isHigherThan(char op1, char op2){
		if(Prec(op1)>Prec(op2)) {
			return true;
		}else {
			return false;
		}
	}

	static boolean isOperator(String tmp) {
		if(tmp.equals("+") || tmp.equals("-") || tmp.equals("/") || tmp.equals("*")) {
			return true;
		}else {
			return false;
		}
	}

	static int Prec(char ch)
	{
		switch (ch){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;

	}
}
