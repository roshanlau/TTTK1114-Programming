import java.util.*;
import java.math.*;
import java.text.DecimalFormat;


class CartesianPoint implements Comparable<CartesianPoint>{
	int xaxis;
	int yaxis;
	double DistancefromA;
	DecimalFormat df = new DecimalFormat("0.00");
	
	CartesianPoint(){
		this.xaxis = 0;
		this.yaxis = 0;
	}
	
	CartesianPoint(int x, int y) {
		this.xaxis = x;
		this.yaxis = y;
	}

	@Override
	public int compareTo(CartesianPoint o) {
		
		return (int) (this.DistancefromA - o.DistancefromA);
	}
	
	String getDistance() {
		return df.format(this.DistancefromA);
	}
	
	void calcDistance(int x, int y) {
		int temp1 = x - this.xaxis;
		int temp2 = y - this.yaxis;
		this.DistancefromA = Math.sqrt((temp1*temp1) + (temp2*temp2));
	}
	
	void setXaxis(int x) {
		this.xaxis = x;
	}
	
	void setYaxis(int y) {
		this.yaxis = y;
	}
	
	int getX() {
		return this.xaxis;
	}
	
	int getY() {
		return this.yaxis;
	}
	
	public String toString() {
		return this.xaxis + " " + this.yaxis + " "  + df.format(this.DistancefromA);
	}
	
}

public class solution {
	
	

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		List<CartesianPoint> graph = new ArrayList<CartesianPoint>();
		
		CartesianPoint temp = new CartesianPoint();
		int aX = sc.nextInt();
		int aY = sc.nextInt();
		CartesianPoint pointA = new CartesianPoint(aX, aY);
		
		sc.nextLine();
		String numLine = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(numLine);
		
		while(st.hasMoreTokens()) {
			temp = new CartesianPoint();
			int x = Integer.parseInt(st.nextToken());
			
			int y = Integer.parseInt(st.nextToken());
			
			temp.setXaxis(x);
			temp.setYaxis(y);
			
			temp.calcDistance(pointA.getX(), pointA.getY());
//			System.out.println(temp);
			
			graph.add(temp);
			 
		}
		
		Collections.sort(graph);
		 
		 Iterator it = graph.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(((CartesianPoint) it.next()).getDistance());
		 }
			
		
		
	}

}
