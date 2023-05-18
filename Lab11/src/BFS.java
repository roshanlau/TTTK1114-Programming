import java.io.*; 
import java.util.*; 

class BFS
{ 
	private int V; // No. of vertices 
	// ***write your code here
	private LinkedList<Integer> adj[];
	String[] area = {"Herbs Garden", "English Garden", "Strawberry Plot",  "Orchid & Nepenthes Garden", "Flower Plot", "Vegetable Plot", "Rose Garden"};

	BFS(int v) { // Constructor
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	void addEdge(int v,int w) { // Function to add an edge into the graph  
		// ***write your code here
		adj[v].add(w);
		adj[w].add(v);
	} 

	void BFS(int s) { // prints BFS traversal from a given source s 
		// Mark all the vertices as not visited (By default set as false) 
		boolean visited[] = new boolean[V]; 

		// Create a queue for BFS 
		LinkedList<Integer> queue = new LinkedList<Integer>(); 

		// Mark the current node as visited and enqueue it 
		visited[s]=true; 
		queue.add(s); 

		while (queue.size() != 0) 
		{ 
			// Dequeue a vertex from queue and print it 
			s = queue.poll(); 
			//System.out.print(s+" "); 
			System.out.print(area[s]+" -> "); 

			// Get all adjacent vertices of the dequeued vertex s 
			// If a adjacent has not been visited, then mark it 
			// visited and enqueue it 
			Iterator<Integer> i = adj[s].listIterator(); 
			while (i.hasNext()) 
			{ 
				int n = i.next(); 
				if (!visited[n]) 
				{ 
					visited[n] = true; 
					queue.add(n); 
				} 
			} 
		} 
	} 
}
	

// This code is contributed by Aakash Hasija 
