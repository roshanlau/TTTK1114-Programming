import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		List<String> numberList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		boolean isDuplicate; 
		String passage = sc.nextLine(); 
		String delims = "\\W+";
		String [] words = passage.split(delims); 
		
		for (String str : words){ 
			str = str.trim(); 
			if(str.equals("0"))
				break;
			isDuplicate=false; 
			isDuplicate =CheckForDuplicates (numberList, str); 
			if (!isDuplicate) { 
				numberList.add(str);
			}
		}
		
		Iterator it = numberList.iterator();
		System.out.print(numberList.size() + ": ");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		Collections.sort(numberList);
		
		Iterator it2 = numberList.iterator();
		System.out.print(numberList.size() + ": ");
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		
		

	}
	
	static boolean CheckForDuplicates (List L1, String word) { 
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
