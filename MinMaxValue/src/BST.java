class BST { 
	
	class Node {
		int key; 
		Node left, right; 
		public Node(int item) { 
			key = item;
			left = right = null; 
		} 
	} 

	Node root; // Root of BST 

	BST() { // Constructor 
		root = null; 
	} 

	void deleteKey(int key) { // This method mainly calls deleteRec() 
		root = deleteRec(root, key); 
	} 

	// A recursive function to delete a node in BST
	Node deleteRec(Node root, int key) { 
		if (root == null) 
			return root; // Base Case: If the tree is empty 
		/* Otherwise, recur down the tree */
		if (key < root.key) 
			root.left = deleteRec(root.left, key); 
		else if (key > root.key) 
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

	
	int minValue(Node root) 
	{ 
		int minv = root.key; 
		while (root.left != null) 
		{ 
			minv = root.left.key; 
			root = root.left; 
		} 
		
		return minv; 
	} 
	
	int getMinValue() {
		return minValue(root);
	}
	
	int getMaxValue() {
		return maxValue(root);
	}
	
	int maxValue(Node root) 
	{ 
		int maxv = root.key; 
		while (root.right != null) 
		{ 
			maxv = root.right.key; 
			root = root.right; 
		} 
		
		return maxv; 
	} 
	
	
	
	

	// This method mainly calls insertRec()
	void insert(int key) { 
		root = insertRec(root, key); 
	} 

	// A recursive function to insert a new key in BST 
	Node insertRec(Node root, int key) { 
		if (root == null) // If the tree is empty, return a new node
		{ 
			root = new Node(key); 
			return root; 
		} 
		/* Otherwise, recur down the tree */
		
		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key >= root.key) 
			root.right = insertRec(root.right, key); 
		return root; // return the (unchanged) node pointer
	} 

	// This method mainly calls printInorder()
	void inorder() { 
		printInorder(root); 
	} 

	void preorder() {
		printPreorder(root);
	}

	void postorder() {
		printPostorder(root);
	}

	// A utility function to do inorder traversal of BST
	void printInorder(Node root) {
		if(root == null) 
			return;
		printInorder(root.left); 
		System.out.print(root.key + " "); 
		printInorder(root.right); 
		
	}

	//add method preorder
	void printPreorder(Node root) {
		if(root == null) 
			return;
		System.out.print(root.key + " ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	//add method postorder
	void printPostorder(Node root) {
		if(root == null) 
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.key + " ");		
	}

	// This method mainly calls searchRec()
	boolean search(int key) { 
		root = searchRec(root, key); 
		if (root!=null)
			return true;
		else
			return false;
	} 

	// This method is to Serach a Rec 
	public Node searchRec(Node root, int key)
	{
		// Base Cases: root is null or key is present at root
		if (root==null || root.key==key)
			return root;
		// Key is greater than root's key
		if (root.key < key)
			return searchRec(root.right, key);
		// Key is smaller than root's key
		return searchRec(root.left, key);
	}
}