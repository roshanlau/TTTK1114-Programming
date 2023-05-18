
public class MurtabakSardin extends Murtabak{

	public MurtabakSardin(String name, String cooking, String filling) {
		super(name, cooking, filling);
	}
	public void displayHowToCook() {
		System.out.println(name + " is cooked by " + cooking);
	}
	
	public void displayFilling() {
		System.out.println(name + " is filled with " + filling);
	}

}
