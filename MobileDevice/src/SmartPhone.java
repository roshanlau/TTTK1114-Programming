
public class SmartPhone extends MobileDevice{
	private String type;

	public SmartPhone(String manufacturer, String model, String type) {
		super(manufacturer, model);
		this.type = type;
	}
	
	public void printDetails() {
		System.out.println("SmartPhone Detail: ");
		System.out.println("Manufacturer: " + super.manufacturer);
		System.out.println("Model: " + super.model);
		System.out.println("Type: " + this.type);
	}

}
