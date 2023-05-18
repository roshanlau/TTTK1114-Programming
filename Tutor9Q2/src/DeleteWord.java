import java.util.Scanner;

public class DeleteWord {

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
		System.out.print("Inorder :");
		uniqueWord.inorder();
		
		System.out.print("\nDelete: ");
		
		String stringDelete = in.next();
		
	
		uniqueWord.deleteKey(stringDelete);
		
		
		System.out.print("\nRecent Inorder :");
		uniqueWord.inorder();
		
	}

}
