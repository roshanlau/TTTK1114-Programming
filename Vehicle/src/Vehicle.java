
public class Vehicle {
	private String model;
	private String plateNo;
	private int speed;
	
	public Vehicle(String m, String p, int s) {
		model = m;
		plateNo = p;
		speed = s;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getPlateNo() {
		return plateNo;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void distanceCovered(int time) {
		System.out.println("Distance Covered (km) with speed " + speed + "km/h and " + time + " is " + (speed*time) + "km");
	}
	
	public void display() {
		System.out.println("Vehicle Model: " + model);
		System.out.println("Vehicle Registration No: " + plateNo);
		System.out.println("Speed (km/h): " + speed);
	}
}
