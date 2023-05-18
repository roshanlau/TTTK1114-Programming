import java.util.*;

public class ProblemSolution {

	public static void main(String[] args) {
		BST numTree = new BST();
		Scanner sc = new Scanner(System.in);
		
		String passage = sc.nextLine();
		
		String delims = "\\W+";
		String [] words = passage.split(delims);
		
		for (String str : words){ 
			
			int number = Integer.parseInt(str);
			if(number == 0) {
				break;
			}
			numTree.insert(number);
		
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
