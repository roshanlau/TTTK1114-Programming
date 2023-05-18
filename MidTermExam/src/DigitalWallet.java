import java.text.DecimalFormat;

public class DigitalWallet {
	double balance;
	String owner;
	
	public DigitalWallet(double blnc, String ownr) {
		balance = blnc;
		owner = ownr;
	}
	
	public boolean pay(double amount) {
		if(amount < 0 || amount > balance) {
			return false;
		}else{
			balance -= amount;
			return true;
		}
	}
	
	public boolean topUp(double amount) {
		if(amount < 0) {
			return false;
		}else {
			balance += amount;
			return true;
		}
	}
	
	public boolean transferTo(DigitalWallet dw, double amount) {
		if(amount < 0 || amount > balance) {
			return false;
		}else {
			balance -= amount;
			dw.balance += amount;
			return true;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return owner + " with balance RM" + df.format(balance);
	}
}
