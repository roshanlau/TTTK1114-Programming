package shape;

public class Circle extends Shape{
	private int radius;
	private double area;
	private double circumference;
	
	public Circle(String s, int r) {
		super(s);
		radius = r;
	}
	
	public void CircleArea() {
		area = (Math.PI * radius * radius);	
	}
	
	public void CicleCircumference() {
		circumference = (Math.PI * radius * 2);
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Radius: " + radius);
		System.out.println("Circle Area: " + area);
		System.out.println("Circle Circumference: " + circumference);
	}
}
