
public class NonAcademic extends Staff{

	public NonAcademic(String id, String name, String post) {
		super(id, name, post);
	}
	
	public void displayInfo() {
		System.out.println(this.name + " (" + this.id + ") is a non-academic staff of UKM");
	}
	
	public void displayPost() {
		System.out.println(name + " (" + id + ") is a " + post + " at UKM");
	}

}
