import java.io.*; 
import java.util.*; 

public class DFS 
{ 
	private int V; 
    // to set the area name using array
	//** write your code here 
	String[] area = {"Kitchen", "Pantry", "Dining Room", "Back Foyer", "Front Foyer", "Study", "Living Room"};

	// array of lists for adjacency list representation 
	//** write your code here
	private LinkedList<Integer> adj[];

	// Constructor 
	DFS(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	//Function to add an edge into the graph 
	void addEdge(int v, int w) 
	{ 
		// Add w to v's list. 
        //** write your code here
		adj[v].add(w); 
		adj[w].add(v); 
	} 

	// A function used by DFS 
	void DFSUtil(int v,boolean visited[]) 
	{ 
		// Mark the current node as visited and print it 
		visited[v] = true; 
		System.out.print(area[v]+" -> "); 

		// Recur for all the vertices adjacent to this vertex 
		Iterator<Integer> i = adj[v].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				DFSUtil(n, visited); 
		} 
	} 

	// The function to do DFS traversal. It uses recursive DFSUtil() 
	void DFS(int v) 
	{ 
		// Mark all the vertices as not visited(set as 
		// false by default in java) 
		boolean visited[] = new boolean[V]; 

		// Call the recursive helper function to print DFS traversal 
		DFSUtil(v, visited); 
	} 
}

	

// This code is contributed by Aakash Hasija 
