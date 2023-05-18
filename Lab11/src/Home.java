import java.util.*;

public class Home {
	 public static void main(String... arg)
	    {
		 DFS graph = new DFS(7);
		 
		 Scanner sc = new Scanner(System.in);
		 
		 graph.addEdge(0, 1);
		 graph.addEdge(0, 3);
		 graph.addEdge(1, 2);
		 graph.addEdge(2, 4);
		 graph.addEdge(3, 4);
		 graph.addEdge(3, 5);
		 graph.addEdge(4, 6);
		 
		 int vertex = sc.nextInt();
		 
		 graph.DFS(vertex);
		 
	    }
}
