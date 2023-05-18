import java.util.*;


public class ProblemSolution {

	static BST bst = new BST();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {



		String passage = sc.nextLine();
		String delims = "\\W+";
		String [] words = passage.split(delims); 

		for(String str : words) {
			str = str.trim();
			bst.insert(new Word(str));
		}

		int choice = 0;

		while (true) {
			System.out.println("\nMenu:\n" + "1. Add new word.\n" +  "2. Delete word.\n" +  "3. Search word.\n" +  "4. Print all words and its frequency.\n" +  "5. Exit.");
			System.out.print("\nInput code: ");
			choice = Integer.parseInt(sc.nextLine().trim());
			System.out.print(choice+"\n");



			if(choice <0 || choice > 5){
				System.out.print("Invalid code, Enter code 1-5.\n");
			}
			else if (choice == 5) {
				System.out.print("Bye..");
				break;
			}
			else {
				Switch(choice);
			}
		}
	}

	static void Switch ( int choice){
		switch (choice) {
		case 1:
			inputWord();
			break;
		case 2:
			System.out.print("Enter word to be deleted: ");
			String str = sc.nextLine();
			System.out.print(str);
			bst.deleteWord(new Word(str));
			break;
		case 3:
			System.out.print("Input Search text: ");
			String search = sc.nextLine();
			System.out.print(search);
			Node searchResult = bst.search(new Word(search));
			if(searchResult == null){
				System.out.print("\nThe word " + search + " is not in the passage.\n");
			}
			else {
				System.out.print("\nThe word ");
				String temp = searchResult.getData().toString();
				String[] word = temp.split("\\W");
				System.out.print(word[0]+ " is used " + word[1] + " times.\n");

			}
			break;
		case 4:
			bst.inorder();
			break;
		default:
		}
	}
	private static void inputWord() {
		System.out.print("Enter new word: ");
		String passage = sc.nextLine();
		String delims = "\\W+";
		String[] words = passage.split(delims);
		for (String str : words) {
			bst.insert(new Word(str));
			System.out.print(str + "\n");
			System.out.print("The word " + str + " has been added successfully.\n");
		}

	}


}
