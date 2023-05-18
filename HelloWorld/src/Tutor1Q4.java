import java.lang.Math.*;
import java.text.DecimalFormat;

public class Tutor1Q4 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		double fee = 5500.00;
		fee = fee * Math.pow(1.025, 5);
		System.out.println(df.format(fee));

	}

}
