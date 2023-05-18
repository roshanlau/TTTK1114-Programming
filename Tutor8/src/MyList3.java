import java.util.*;

public class MyList3 {
	public static void main(String args[]) { 
		List<String> list1 = new ArrayList <String>(); Scanner in = new Scanner(System.in); 
		boolean isDuplicate; 
		int size=0; 
		String passage = in.nextLine(); // read input passage 
		String delims = "\\W+"; // split any non word 
		String [] words = passage.split(delims); 
		for (String str : words){ 
			str = str.trim(); 
			isDuplicate=false; 
			isDuplicate =CheckForDuplicates (list1, str); 
			if (!isDuplicate) { 
				//add new word into list and update the list size } 
				list1.add(str);
				size++;
				//sort the list 
				Collections.sort(list1);  
			}
		}
		displayList(list1, size);
	} 
	static boolean CheckForDuplicates (List L1, String word) { 
		Iterator it = L1.iterator();
		boolean check = false;
		while(it.hasNext()) {
			
			String temp = (String) it.next();
			if(temp.equals(word)) {
				check = true;
				
			}
		}
		return check;

	}

	static void displayList(List l1, int s) { 
		Iterator it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
