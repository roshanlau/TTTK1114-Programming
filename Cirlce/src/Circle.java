import java.text.DecimalFormat;
import java.util.*;
import java.math.*;

public class Circle {
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	private double radius;
	
	public void Circle() {
		radius = 0.00;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	
}