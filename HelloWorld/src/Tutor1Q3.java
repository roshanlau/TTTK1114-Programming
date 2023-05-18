import java.text.DecimalFormat;
import java.util.*;

public class Tutor1Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float totalPrice = s.nextFloat();
		float totalCost = totalPrice + (totalPrice * 6 / 100);

		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);

		System.out.println(df.format(totalCost));
	}

}
