import java.util.*;

public class MyList {
	public static void main(String args[]){
		List<String> list1 = new ArrayList <String>(); 
		boolean isDuplicate; 
		Scanner in = new Scanner (System.in); 
		String passage = in.nextLine(); // read input passage 
		String delims = "\\W+"; // split any non word 
		String [] words = passage.split(delims); 
		for (String str : words){
			str = str.trim(); 
			isDuplicate=false; 
			isDuplicate =CheckForDuplicates (list1, str); 
			if (!isDuplicate) { 
				//add new word into list and update the list size
				list1.add(str);
			}
		}
		// display all elements of list 
		Collections.sort(list1);
		Iterator it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	static boolean CheckForDuplicates (List L1, String word) { 
		// check for duplicate words 
		// if found duplicate return true else return false 
		Iterator it = L1.iterator();
		boolean check = false;
		while(it.hasNext()) {
			
			String temp = (String) it.next();
			if(temp.equals(word)) {
				check = true;
				break;
			}
		}
		
		return check;
		
	}
		 
}
