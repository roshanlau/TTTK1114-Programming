import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListWords {
	public static void main(String args[]){
		List<String> list1 = new ArrayList <String>(); 
		
		Scanner in = new Scanner (System.in); 
		
		String passage = in.nextLine(); // read input passage 
		String delims = "\\W+"; // split any non word 
		String [] words = passage.split(delims); 
		
		for (String str : words){
			str = str.trim(); 
			list1.add(str);
		}
		
		Iterator it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}