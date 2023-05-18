import java.text.DecimalFormat;

public class Triangle extends Shape {
	private int width, height;
	
	public Triangle (int n, int m) {
		width = n;
		height = m;
	}
	
	public void calculateArea() {
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format((double)(width*height)/2.0));
	}
}
