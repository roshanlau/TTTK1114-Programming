class BST { 
	class Node {
		String key; 
		Node left, right; 
		public Node(String item) { 
			key = item;
			left = right = null; 
		} 
	} 
	
	Node root; // Root of BST 
	
	BST() { // Constructor 
		root = null; 
	} 
	
	void deleteKey(String key) { // This method mainly calls deleteRec() 
		if(!search(key)) {
			System.out.println(key + " does not apper in BST");
			return;
		}
		root = deleteRec(root, key);
	} 
	
	// A recursive function to delete a node in BST
	Node deleteRec(Node root, String key) { 
		if (root == null) 
			return root; // Base Case: If the tree is empty 
		/* Otherwise, recur down the tree */
		if (key.compareTo(root.key) < 0) 
			root.left = deleteRec(root.left, key); 
		else if (key.compareTo(root.key) > 0) 
			root.right = deleteRec(root.right, key); 
		// if key is same as root's key, then This is the node to be deleted 
		else { 
			// node with only one child or no child 
			if (root.left == null) 
				return root.right; 
			else if (root.right == null) 
				return root.left; 
			// node with two children: Get the inorder successor 
			//(smallest in the right subtree) 
			root.key = minValue(root.right); 
			// Delete the inorder successor 
			root.right = deleteRec(root.right, root.key); 
		}
		return root; 
	} 
	
	String minValue(Node root) 
	{ 
		String minv = root.key; 
		while (root.left != null) 
		{ 
			minv = root.left.key; 
			root = root.left; 
		} 
		return minv; 
	} 
	
	// This method mainly calls insertRec()
	void insert(String key) { 
		root = insertRec(root, key); 
	} 
	
	// A recursive function to insert a new key in BST 
	Node insertRec(Node root, String key) { 
		
		
		if (root == null) // If the tree is empty, return a new node
		{ 
			root = new Node(key); 
			return root; 
		} 
		/* Otherwise, recur down the tree */
		if (key == root.key) 
			System.out.println("\nThe " + key+ " is in the BST");
		if (key.compareTo(root.key) < 0) 
			root.left = insertRec(root.left, key); 
		else if (key.compareTo(root.key) > 0) 
			root.right = insertRec(root.right, key); 
		return root; // return the (unchanged) node pointer
	} 
	
	// This method mainly calls printInorder()
	void inorder() { 
		printInorder(root); 
	} 
	
	// A utility function to do inorder traversal of BST
	void printInorder(Node root) { 
		if (root != null) 
		{ 
			printInorder(root.left); 
			System.out.println(root.key); 
			printInorder(root.right); 
		} 
	} 
	
	// A utility function to do preorder traversal of BST
	void printPreorder(Node root) {
		if(root != null) {
			System.out.print(root.key + " ");
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}
	
	// A utility function to do postorder traversal of BST
	void printPostorder(Node root) {
		if(root != null) {
			printPreorder(root.left);
			printPreorder(root.right);
			System.out.print(root.key + " ");
		}
	}
	
	// This method mainly calls searchRec()
	boolean search(String key) { 
		root = searchRec(root, key); 
		if (root!=null)
			return true;
		else
			return false;
	} 
	
	// This method is to Serach a Rec 
	public Node searchRec(Node root, String key)
	{
		// Base Cases: root is null or key is present at root
		if (root==null || root.key==key)
			return root;
		// Key is greater than root's key
		if (root.key.compareTo(key) < 0)
			return searchRec(root.right, key);
		// Key is smaller than root's key
		return searchRec(root.left, key);
	}

	

	
	
	
}