
public class KuihBakar extends MalayKuih{
	protected String cooking;

	public KuihBakar(String name, String cooking) {
		super(name);
		this.cooking = cooking;	
	}
	
	public void displayHowToCook() {
		System.out.println(name + " is cooked by " + cooking);
	}

}
