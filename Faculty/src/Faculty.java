import java.text.DecimalFormat;
import java.text.DecimalFormat;

public class Faculty {
	protected String name;
	private int basicSalary;

	public Faculty(String name, int basic) {
		this.name = name;
		this.basicSalary = basic;
	}
	
	public String getDetails() {
		DecimalFormat df = new DecimalFormat("0.00");
		return name + " RM" + df.format(basicSalary);
	}
	
	public double getSalary() {
		return (double)basicSalary;
	}
}
