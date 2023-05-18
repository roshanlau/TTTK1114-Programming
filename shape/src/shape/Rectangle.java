package shape;

public class Rectangle extends Shape{
	private int width, height;
	private int area, perimeter;
	
	public Rectangle(String s, int w, int h) {
		super(s);
		width = w;
		height = h;
	}
	
	public void RectangleArea() {
		area = width * height;
	}
	
	public void RectanglePerimeter() {
		perimeter = (2 * width) + (2 * height);
	}
	
	public void displayInfo() {
		super.displayInfo();
		
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Rectangle Area: " + area);
		System.out.println("Rectangle Perimeter: " + perimeter);
	}
}
