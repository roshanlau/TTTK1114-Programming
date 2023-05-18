import java.util.*;

public class ProblemSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST bst = new BST();
		
		String passage = sc.nextLine();
		String delims = "\\W+";
		String [] words = passage.split(delims);
		
		for(String str : words) {
			str = str.trim();
			bst.insert(str);
		}
		
		bst.preorder();
		
	}

}
