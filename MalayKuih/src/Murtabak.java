
public class Murtabak extends MalayKuih{
	protected String cooking, filling;

	public Murtabak(String name, String cooking, String filling) {
		super(name);
		this.cooking = cooking;	
		this.filling = filling;
	}
	
	public void displayHowToCook() {
		System.out.println(name + " is cooked by " + cooking);
	}
	
	public void displayFilling() {
		System.out.println(name + " is filled with " + filling);
	}

}
