import java.text.DecimalFormat;

public class TouchNGo extends DigitalWallet{
	int point;

	public TouchNGo(double blnc, String ownr) {
		super(blnc, ownr);
		point = 0;
	}

	public void addRewards(double RM) {
		if(RM < 0) {
			
		}else if (RM < 500) {
			point += (RM * 0.1);
		}else {
			point += (RM * 0.2);
		}
	}
	
	public void useRewards(int pt) {
		if(pt < 0 || point < pt) {
			
		}else {
			point -= pt;
		}
	}
	
	public int getRewards() {
		return point;
	}
	
	public void Parking(int hr, int RMPerHr) {
		int amount = hr * RMPerHr;
		super.balance -= amount;
		this.addRewards(amount);
	}
	
	public void Toll(int km, int RMPerKm) {
		int amount = km * RMPerKm;
		super.balance -= amount;
		this.addRewards(amount);
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.owner + " TouchNGo with balance RM" + df.format(super.balance);
	}
}
