import java.text.DecimalFormat;

public class AssociateProfessor extends AssistantProfessor{
	private int medAllowance;
	protected String name = super.name;
	
	public AssociateProfessor(String name, int basic, int DA, int medAllowance) {
		super(name, basic, DA);
		this.medAllowance = medAllowance;
	}
	
	public double getSalary() {
		return super.getSalary() + this.medAllowance;
	}

	public String getDetails() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Associate Professor " + name + " RM" + df.format(this.getSalary());
	}
}
