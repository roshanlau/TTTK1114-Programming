class Loan { 
	public double getRateOfInterest() { 
		return 4.5;
	}
}
class CarLoan extends Loan {
	public double getRateOfInterest() { 
		return 3.6;
	} 
	public String toString() { 
		return "Car Loan"; 
	}

}
class HousingLoan extends Loan {
	public String toString() {
		return "Housing Loan";
	}
}

class PersonalLoan extends Loan {
	public double getRateOfInterest() { 
		return 6.5;
		} 
	public String toString() { 
		return "Personal Loan";
	}
}
public class LoanApp {
	public static void main(String args[]) { 
		Loan[] loan= {new CarLoan(), new HousingLoan(), new PersonalLoan()}; 
		for (int i=0;i<loan.length;i++) { 
			System.out.println("Interest Rate for " +loan[i] + " is " +loan[i].getRateOfInterest() + "%"); 
		}
	}
}
