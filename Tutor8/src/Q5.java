import java.util.*;

public class Q5 {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		
		String numberLine = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(numberLine);
		
		
		while(st.hasMoreTokens()) {
			int nextInt = Integer.parseInt(st.nextToken());

			if(nextInt%2 == 0) {
				evenList.add(nextInt);
			}else {
				oddList.add(nextInt);
			}
			
		}
		
		Collections.sort(oddList);
		Iterator it = oddList.iterator();
		
		System.out.print("Odd List (" + oddList.size() + "): ");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		Collections.sort(evenList);
		Iterator it2 = evenList.iterator();
		
		System.out.print("Even List (" + evenList.size() + "): ");
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		
	}
}
