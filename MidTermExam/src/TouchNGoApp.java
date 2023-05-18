import java.util.Scanner;

public class TouchNGoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n; int m;
		double balance = sc.nextDouble();
		String owner = sc.nextLine();
		TouchNGo myT = new TouchNGo(balance, owner);

		int action = sc.nextInt();
		switch (action) {
		case 0: System.out.println(myT instanceof DigitalWallet);
			    break; 
		case 1: n = sc.nextDouble(); 
				DigitalWallet yourWallet = new DigitalWallet(70, "John");
				myT.transferTo(yourWallet,n);
	    	    System.out.println(myT.getBalance()+" "+yourWallet.getBalance());
	    	    break;
		case 2: n = sc.nextDouble(); 
			    myT.addRewards(n);
			    System.out.println(myT.getRewards());
			    break;
		case 3: m = sc.nextInt(); 
	    		myT.addRewards(700);
	    		myT.useRewards(m);
	    		System.out.println(myT.getRewards());
	    		break;
		case 4: myT.Parking(1, 3);
				System.out.println(myT.getRewards());
				break;
		case 5: myT.Toll(1, 3);
				System.out.println(myT.getRewards());
				break;
		/*case 7: System.out.println(myWallet.getOwner());*/	
		}
	}
}