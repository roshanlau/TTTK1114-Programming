import java.util.*;

public class VehicleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		String model = sc.nextLine();
		
		String plateNo = sc.nextLine();
		
		int speed = sc.nextInt();
		int time = sc.nextInt();
		
		if(n == 1) {
			int noOfPassenger = sc.nextInt();
			Bus bus = new Bus(model, plateNo, speed, noOfPassenger);
			bus.display();
			bus.distanceCovered(time);
		}else {
			int cargoWeight = sc.nextInt();
			Truck truck = new Truck(model, plateNo, speed, cargoWeight);
			truck.display();
			truck.distanceCovered(time);
		}
		
		
	}

}
