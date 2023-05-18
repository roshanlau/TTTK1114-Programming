
public class ABCMember {
	protected String name;
	protected String post;
	
	public ABCMember(String name, String post) {
		this.name = name;
		this.post = post;
	}
	
	public void printDetails() {
		System.out.println(this.name + " is a " + this.post);
	}
}
