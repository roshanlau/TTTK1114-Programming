import java.text.DecimalFormat;

public class Product {
	protected int currStock; 
	protected double RMperUnit; 
	protected String name; 
	protected int totalStock;
	
	public Product(int st, double RM, String nm){
		currStock = st;
		totalStock = st;
		RMperUnit = RM;
		name = nm;
	}
	
	public double buy(int unit) {
		if(unit<0 || currStock < unit) {
			return 0;
		}else {
			currStock -= unit;
			return unit * RMperUnit;
		}
	}
	
	public void topupStock(int unit) {
		if(unit<0 || currStock < unit) {
			
		}else {
			totalStock += unit;
			currStock += unit;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getStock() {
		return currStock;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return name + " with price per unit RM"  + df.format(RMperUnit) + " with balance " + currStock + " unit";
	}
}
