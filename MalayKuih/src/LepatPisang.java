
public class LepatPisang extends MalayKuih{
	protected String cooking;

	public LepatPisang(String name, String cooking) {
		super(name);
		this.cooking = cooking;	
	}
	
	public void displayHowToCook() {
		System.out.println(name + " is cooked by " + cooking);
	}
}
