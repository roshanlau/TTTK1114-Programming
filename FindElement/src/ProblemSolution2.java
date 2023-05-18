import java.util.*;

public class ProblemSolution2 {
	public static void main(String[] args) {

		BST numTree = new BST();
		Scanner sc = new Scanner(System.in);

		int nextNum = sc.nextInt();

		while(nextNum != 0){
			numTree.insert(nextNum);
			nextNum = sc.nextInt();
		}

		int toSearch = sc.nextInt();

		String result = null;

		if(numTree.search(toSearch)) {
			result = "FOUND";
		}else {
			result = "NOT FOUND";
		}

		System.out.println("Number " + toSearch + " is " + result + " in this tree.");

	}
}
