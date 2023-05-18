
public class BasicPhone extends MobileDevice{

	public BasicPhone(String manufacturer, String model) {
		super(manufacturer, model);
	}
	
	public void printDetails() {
		System.out.println("Basic Phone Detail: ");
		System.out.println("Manufacturer: " + super.manufacturer);
		System.out.println("Model: " + super.model);
	}

}
