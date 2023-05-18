
public class UkmMember {
	protected String id, name;
	
	public UkmMember(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println(this.name + "(" + this.id + ") is a member of UKM");
	}

}
