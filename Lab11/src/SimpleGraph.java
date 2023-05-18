import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleGraph {
	 public static void main(String... arg)
	    {
	        int[][] adjacency_matrix;
 
	        int number_of_vertices;
	        int source = 0, destination = 0;
	        Scanner scan = new Scanner(System.in);     
	           
	        number_of_vertices = 4;
	        
            //** write your code here - add the adjacency_matrix
	        adjacency_matrix = new int[][]{
	        	{0,		14,		10,		0},
	    		{14,	0,		0,		30},
	    		{10,	0,		0,		20},
	    		{0,		30,		20,		0}
	        };
	        
            //** write your code here - input of start vertex name as "source"	
	        source = scan.nextInt();
	        //** write your code here - input of end vertex name as "destination"
	        destination = scan.nextInt();
	               
	         Dijkstra dijkstrasAlgorithm = new Dijkstra(number_of_vertices);
	         dijkstrasAlgorithm.dijkstra_algorithm(adjacency_matrix, source);
	 
	         System.out.print("The shorted path from " );
	         for (int i = 0; i < dijkstrasAlgorithm.distances.length ; i++)
	         {
	            if (i == destination)
	                    System.out.println(source + " to " + i + " is "
	                            + dijkstrasAlgorithm.distances[i]);
	            }
	       
	    }
}
