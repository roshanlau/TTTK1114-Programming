import java.text.DecimalFormat;

public class Professor extends AssociateProfessor{
	protected String name = super.name;
	private int otherAllowance;
	
	public Professor(String name, int basic, int DA, int medAllowance, int otherAllowance) {
		super(name, basic, DA, medAllowance);
		this.otherAllowance = otherAllowance;
	}
	
	public double getSalary() {
		return super.getSalary() + ((super.getSalary() * otherAllowance)/100);
	}

	public String getDetails() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Professor " + name + " RM" + df.format(this.getSalary());
	}
}
