
public class Truck extends Vehicle{
	private int cargoWeight;
	
	public Truck(String m, String p, int s, int w) {
		super(m, p, s);
		cargoWeight = w;
	}

	public void display() {
		super.display();
		System.out.println("Cargo Weight Limit (kg): " + cargoWeight);
	}
	
}
