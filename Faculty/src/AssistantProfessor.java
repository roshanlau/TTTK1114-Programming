import java.text.*;

public class AssistantProfessor extends Faculty{
	private int DA;
	protected String name = super.name;
	
	public AssistantProfessor(String name, int basic, int DA) {
		super(name, basic);
		this.DA = DA;
	}
	
	public double getSalary() {
		return super.getSalary() + ((super.getSalary() * DA)/100);
	}
	
	public String getDetails() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Assistant Professor " + name + " RM" + df.format(this.getSalary());
	} 

}
