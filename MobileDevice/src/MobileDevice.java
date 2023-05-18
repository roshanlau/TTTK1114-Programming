
public class MobileDevice implements RadioTuner{
	protected String manufacturer;
	protected String model;
	public String station;
	public double frequency;
	
	public MobileDevice(String manufacturer, String model) {
		this.manufacturer = manufacturer;
		this.model = model;
	}
	
	public void printDetails() {
		System.out.println("MobilePhone Detail:");
		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("Model: " + this.model);
	}

	@Override
	public void setStation(String station) {
		this.station = station;
	}

	@Override
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

}
