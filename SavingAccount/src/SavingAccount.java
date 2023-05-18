
public class SavingAccount {
	
	private double balance;
	

	public SavingAccount(double amount) {
		balance = amount;
	}

	public void addInterest() {
		balance = balance + (balance*0.03);
	}

	public double getBalance(){
		return balance;
	}
}
