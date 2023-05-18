
public class Academic extends Staff{

	public Academic(String id, String name, String post) {
		super(id, name, post);
	}
	
	public void displayInfo() {
		System.out.println(this.name + " (" + this.id + ") is an academic staff of UKM");
	}
	
	public void displayPost() {
		System.out.println(name + " (" + id + ") is a " + post + " at UKM");
	}

}
