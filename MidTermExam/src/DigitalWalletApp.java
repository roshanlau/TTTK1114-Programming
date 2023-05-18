import java.util.Scanner;

public class DigitalWalletApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n;
		double balance = sc.nextDouble();
		String owner = sc.nextLine();
		DigitalWallet myWallet = new DigitalWallet(balance, owner);

		int action = sc.nextInt();
		switch (action) {
		case 0: System.out.println(myWallet);
			    break;
		case 1: n = sc.nextDouble(); myWallet.pay(n);
			    System.out.println(myWallet.getBalance());
			    break;
		case 2: n = sc.nextDouble();
	    	    System.out.println(myWallet.pay(n));
	    	    break;
		case 3: n = sc.nextDouble(); myWallet.topUp(n);
	    		System.out.println(myWallet.getBalance());
			    break;
		case 4: n = sc.nextDouble();
			    System.out.println(myWallet.topUp(n));
			    break;
		case 5: n = sc.nextDouble(); 
				DigitalWallet yourWallet = new DigitalWallet(70, "John");
				myWallet.transferTo(yourWallet,n);
	    	    System.out.println(myWallet.getBalance()+" "+yourWallet.getBalance());
	    	    break;
		case 6: n = sc.nextDouble(); 
				DigitalWallet hisWallet = new DigitalWallet(70, "JingXi");
				System.out.println(myWallet.transferTo(hisWallet,n));
				break;
		case 7: System.out.println(myWallet.getOwner());		
		}
		
		
	}

}