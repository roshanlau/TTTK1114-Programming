import java.util.*;

public class Penang {

	public static void main(String[] args) {
		MST t = new MST();
		int graph[][] = new int[][] {
			{0, 25, 	31,		22,		 9, 	37, 	24,		 6},
			{25, 0, 	11,		 9, 	18, 	25, 	11,	 	20},
			{31, 11, 	0,		10,		23, 	6, 		16,		27},
			{22, 9, 	10, 	0,		14,		 17, 	6, 		17},
			{9, 18, 	23, 	14,		0, 		30, 	11, 	5},
			{37, 25, 	6, 		17, 	30, 	0, 		22, 	33},
			{24, 11, 	16, 	6, 		11, 	22, 	0, 		14},
			{6, 20, 	27, 	17, 	5, 		33, 	14, 	0}
			
		};
				
		t.primMST(graph);
	}

}
