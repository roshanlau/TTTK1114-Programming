import java.util.Scanner;

public class ProblemSolution {
	public static void main(String[] args) {
		BST uniqueWord = new BST();

		Scanner in = new Scanner(System.in);

		String passage = in.nextLine();
		String delims = "\\W+";
		String [] words = passage.split(delims); 

		for(String str : words) {
			str = str.trim();
			uniqueWord.insert(str);
		}

		uniqueWord.inorder();
	}
}
