
public class Coin implements Measurable {
	private double value;
	private String name;
	
	public Coin(double v,String n) {
		value=v;
		name=n;
	}
	public double getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public double getMeasure() {
		return value;
	}

}
