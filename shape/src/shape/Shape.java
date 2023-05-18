package shape;

public class Shape {
	protected String name;
	
	public Shape(String n) {
		name = n;
	}
	

	public void displayInfo() {
		System.out.println("The Shape is " + name);
	}
}
