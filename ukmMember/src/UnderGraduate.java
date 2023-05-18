
public class UnderGraduate extends Student{

	public UnderGraduate(String id, String name, String programme) {
		super(id, name, programme);
	}
	
	public void displayInfo() {
		System.out.println(this.name + " (" + this.id + ") is an undergraduate student of UKM");
	}
	
	public void displayProgramme() {
		System.out.println(name + " (" + id + ") is studying " + programme + " at UKM");
	}

}
