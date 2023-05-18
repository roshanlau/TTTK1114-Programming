import java.text.DecimalFormat;

public class MyPrintCard {
	private double balance;

	public MyPrintCard() {
		balance = 10.00;
	}

	public double getBalance() { 
		return balance;
	}

	public void topupCard(double amt) {
		balance += amt;
	}

	public boolean payService(double amt) {
		if(balance-amt > 5) {
			balance -= amt;
			return true;
		}
		else
			return false;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "RM" + df.format(balance);
	}
}
