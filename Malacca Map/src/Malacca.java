import java.util.Scanner;

public class Malacca {

	public static void main(String[] args) {
		int[][] adjacency_matrix;
		String[] district = {"Masjid Tanah", "Alor Gajah", "Tangge Batu", "Bukit Katil", "Kota Melaka", "Jasin"};
        int number_of_vertices;
        int start = 0, end = 0;
        Scanner sc = new Scanner(System.in);     
           
        number_of_vertices = 6;
        
        //** write your code here - add the adjacency_matrix
        adjacency_matrix = new int[][]{
        	{0,		14,		15,		0,		0,		0},
    		{14,	0,		25,		27,		0,		32},
    		{15,	25,		0,		23,		16,		0},
    		{0,		27,		23,		0,		10,		21},
    		{0,		0,		16,		10,		0,		31},
    		{0,		32,		0,		21,		31,		0}
        };
        
        start = sc.nextInt();
        end = sc.nextInt();
        
        Dijkstra dijkstrasAlgorithm = new Dijkstra(number_of_vertices);
        dijkstrasAlgorithm.dijkstra_algorithm(adjacency_matrix, start);

       
        for (int i = 0; i < dijkstrasAlgorithm.distances.length ; i++)
        {
           if (i == end)
                   System.out.println("The Shorted Path from " + district[start] + " to " + district[end] + " is "
                           + dijkstrasAlgorithm.distances[i] + "km");
           }
        
	}

}
