
public class PostGraduate extends Student{

	public PostGraduate(String id, String name, String programme) {
		super(id, name, programme);
	}
	
	public void displayInfo() {
		System.out.println(this.name + " (" + this.id + ") is a post-graduate student of UKM");
	}
	
	public void displayProgramme() {
		System.out.println(name + " (" + id + ") doing research in " + programme + " at UKM");
	}

}
