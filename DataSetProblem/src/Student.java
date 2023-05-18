
public class Student implements Measurable{
	private String name;
	private double height;
	
	public Student(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}

	@Override
	public double getMeasure() {
		return this.height;
	}
 
}
