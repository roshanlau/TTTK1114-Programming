import java.util.Scanner;
import java.text.DecimalFormat;

public class meowPlanet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int no_planet = sc.nextInt();
		float degrate_rate = sc.nextFloat();
		float repair_rate = sc.nextFloat();
		float power = sc.nextFloat();
		float money = 0;
		
		for(int i = 0; i < no_planet; i++) {
			int type = sc.nextInt();
			float val = sc.nextFloat();
			
			if(type == 1) {
				money += val * power;
				power *= ( 1 - (0.01 * degrate_rate));
			}else {
				money -= val * power;
				power *= ( 1 + (0.01 * repair_rate));
			}
				
		}
		
		System.out.println(df.format(money));
	}	
}
