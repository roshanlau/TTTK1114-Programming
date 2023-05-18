import java.text.DecimalFormat;

public class IT extends ABCMember implements Salary{
	private double elaun;
	private double salary = 4000.0;

	public IT(String name, String post, double elaun) {
		super(name, post);
		this.elaun = elaun;
	}

	@Override
	public double getSalary() {
		return this.elaun + this.salary;
	}
	
	public void printDetails() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(super.name + " is a " + super.post + " with salary: RM " + df.format(this.getSalary()));
	}

}
