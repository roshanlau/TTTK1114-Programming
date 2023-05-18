import java.util.*;
import java.text.DecimalFormat;

public class SavingAccountApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double amount;
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			amount = sc.nextDouble();
			SavingAccount cust1 = new SavingAccount(amount);
			cust1.addInterest();
			System.out.println("Case #" + i + ": " + df.format(cust1.getBalance()));
			
		}
		
	}

}
