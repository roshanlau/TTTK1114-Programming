
public class BSTApp {
	
	public static void main(String[] args) {
		
		BST tree = new BST();
		
		tree.insert(15);
		tree.insert(8);
		tree.insert(6);
		tree.insert(12);
		tree.insert(21);
		tree.insert(25);
		
		System.out.println("Inorder traversal of the given tree : ");
		tree.inorder();
	}
}
