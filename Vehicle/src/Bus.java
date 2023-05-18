
public class Bus extends Vehicle{
	private int noOfPassenger;

	public Bus(String m, String p, int s, int n) {
		super(m, p, s);
		noOfPassenger = n;
	}
	
	public void display() {
		super.display();
		System.out.println("No of Passenger: " + noOfPassenger);
	}

}
