import java.util.*;

public class ProblemSolution {
	public static void main(String[] args) {
		BST numTree = new BST();
		Scanner sc = new Scanner(System.in);

		int nextNum = sc.nextInt();

		while(nextNum != 0){
			numTree.insert(nextNum);
			nextNum = sc.nextInt();
		}
		
		System.out.print("Preorder : ");
		numTree.preorder();
		System.out.print("\nInorder : ");
		numTree.inorder();
		System.out.print("\nPostorder : ");
		numTree.postorder();
		System.out.print("\nMinimum Element in tree is : " + numTree.getMinValue());
		System.out.print("\nMaximum Element in tree is : " + numTree.getMaxValue());
	}

}
