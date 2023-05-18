import java.util.*;

public class QueueJava {
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String inStr = sc.nextLine();
			StringTokenizer st = new StringTokenizer(inStr);
			String nextT = st.nextToken();
			
			while(!nextT.equals(";")) {
				q.enqueue(nextT);
				nextT = st.nextToken();
			}
			
			System.out.print(q.size() + " : ");
			
			while(!q.isEmpty()) {
				System.out.print(q.dequeue() + " ");
			}
			
			
		}
		
	}
}
