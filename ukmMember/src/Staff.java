
public class Staff extends UkmMember{
	
	protected String post;
	
	public Staff(String id, String name, String post) {
		super(id, name);
		this.post = post;
	}
	
	public void displayPost() {
		System.out.println(name + " (" + id + ") is a " + this.post + " of UKM");
	}

}
