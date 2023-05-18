import java.util.*;

public class OddEvenNumber {

	public static void main(String[] args) {
		Queue<Integer> oddNum = new Queue<Integer>();
		Queue<Integer> evenNum = new Queue<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String numLine = sc.nextLine();
			StringTokenizer st = new StringTokenizer(numLine);
			String nextT = st.nextToken();
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(nextT);
				if(num%2 == 0) {
					evenNum.enqueue(num);
				}else {
					oddNum.enqueue(num);
				}
				nextT = st.nextToken();
			}
			
			String oddResult = "oddQueue " + oddNum.size() + ": ";
			while(!oddNum.isEmpty()) {
				oddResult += oddNum.dequeue() + " ";
			}
			System.out.println(oddResult);
			
			String evenResult = "evenQueue " + evenNum.size() + ": ";
			while(!evenNum.isEmpty()) {
				evenResult += evenNum.dequeue() + " ";
			}
			System.out.println(evenResult);
		}
	}

}
