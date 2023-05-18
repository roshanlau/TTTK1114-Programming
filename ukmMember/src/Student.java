
public class Student extends UkmMember{
	protected String programme;

	public Student(String id, String name, String programme) {
		super(id, name);
		this.programme = programme;
	}
	
	public void displayProgramme() {
		System.out.println(name + " (" + id + ") is studying " + this.programme + " at UKM");
	}

}
