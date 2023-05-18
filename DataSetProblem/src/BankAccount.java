
public class BankAccount implements Measurable{	
	private int accNumber;
	private double balance;
	private static int LastAssignedNumber;
	
	public BankAccount() {
		balance=0.0;
		LastAssignedNumber++;
		accNumber=LastAssignedNumber;
	}
	
	public BankAccount(double b) {
		balance=b;
		LastAssignedNumber++;
		accNumber=LastAssignedNumber;
	}
	public int getAccountNuber() {
		return accNumber;
	}
    
    @Override
	public double getMeasure() {	
		return balance;
	}
	@Override
	// write your code here ovveride new method from interface Measurable
	public String getName() {
		return null;
	}

}
