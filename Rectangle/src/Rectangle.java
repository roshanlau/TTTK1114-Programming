
public class Rectangle {
	
	private double width;
	private double height;
	
	public void Rectangle() {
		width = 0.00;
		height = 0.00;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

	public double getArea() {
		return width*height;
	}

	public double getPerimeter() {
		return (2*width) + (2*height);
	}
	
}
