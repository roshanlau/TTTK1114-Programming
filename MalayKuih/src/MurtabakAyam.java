
public class MurtabakAyam extends Murtabak{
	public MurtabakAyam(String name, String cooking, String filling) {
		super(name, cooking, filling);
	}

	public void displayHowToCook() {
		System.out.println(name + " is cooked by " + cooking);
	}
	
	public void displayFilling() {
		System.out.println(name + " is filled with " + filling);
	}

}
