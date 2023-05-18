public class DataSet {
	private double sum;
	private Measurable max;
	private int count;
	
	
	public DataSet() {
		count=0;
	}
	
	public void add(Measurable x) {
		sum=sum+x.getMeasure();
		if(count==0 || max.getMeasure() < x.getMeasure()) {
			max=x;			
		}
		count++;
	}	
	public Measurable getMax() {
		return max;
	}
	public double getAverage() {		
		return sum/count;
	}
	
}
