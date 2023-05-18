import java.util.*;
public class BST {
	Node root;
	public BST(){
		root = null;
	}

	void insert(Word key)     {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, Word key) {
		if (root == null)         {
			root = new Node(key);
			return root;
		}
		if (key.compareTo(root.key) < 0 )
			root.left = insertRec(root.left, key);
		else if (key.compareTo(root.key) > 0)
			root.right = insertRec(root.right, key);
		if(root.getData().equals(key))
			root.getData().increment();
		return root;
	}


	void deleteWord(Word key) {
		Node found = search(key);
		if(found == null){
			System.out.print("\nThe word "+key.getWord()+" is not in the passage.\n");
		}
		else {
			System.out.print("\nOne of the words " + key.getWord() + " was successfully deleted.\n");

			if (found.key.getFrequency() == 1) {
				root = deleteRec(root, key);
			} else {
				found.key.decrement();
			}
		}
	}



	Node deleteRec(Node root, Word key)     {
		if (root == null)
			return root;
		if (key.compareTo(root.key) < 0)
			root.left = deleteRec(root.left, key);
		else if (key.compareTo(root.key) > 0)
			root.right = deleteRec(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.key = minValue(root.right);
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}



	Word minValue(Node root){
		Word minv = root.key;
		while (root.left != null)  {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}



	public static void search( BST tree ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Search For: ");
		Word searchWord = new Word(sc.next());
		if ( tree.search(searchWord) == null ){
			System.out.println("Value was not found.");
		}
		else{
			System.out.println(searchWord.getFrequency());
		}
	}



	public Node search( Word w ){
		if ( root == null ){
			System.out.println("No items to search.");
			return null;
		}
		else{
			return search(w,root);
		}
	}


	private Node search( Word w, Node n){
		if ( w.equals(n.getData()) ){
			return n;
		}
		if ( w.compareTo( n.getData() ) < 0 ){
			if( n.getLeft() == null){
				return null;
			}
			else{
				return search(w, n.getLeft());
			}
		}
		else{
			if ( n.getRight() == null ){
				return null;
			}

			else{
				return search(w, n.getRight());
			}
		}
	}



	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null)
		{
			inorderRec(root.left);
			System.out.print(root.key+"\n");
			inorderRec(root.right);
		}
	}
}



class Node {
	Word key = null;
	Node left,right;
	public Node(Word word){
		key = word;
		left = right = null;
	}
	public Word getData(){
		return key;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
}



class Word {
	private String word;
	public int freq;
	public Word( String word){
		this.word = word;
		this.freq = 1;
	}

	

	public void increment(){
		freq++;
	}
	public void decrement(){
		freq--;
	}
	public String getWord(){
		return word;
	}

	public int getFrequency(){
		return freq;
	}

	public int compareTo(Word w){
		return word.compareTo( w.getWord() );
	}

	@Override
	public String toString(){
		return word +"("+ freq + ")";
	}
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Word))
			return false;
		return word.equals(((Word)other).word);
	}
}