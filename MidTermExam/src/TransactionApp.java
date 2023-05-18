import java.util.Scanner;
import java.text.DecimalFormat;

public class TransactionApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double p = sc.nextDouble();
		double q = sc.nextDouble();
		
		DigitalWallet ahmadWallet = new TouchNGo(p , "Ahmad");
		DigitalWallet jingxiWallet = new TouchNGo(q, "JingXi");

		Product bag = new Product(100, 10.00, "Bag");
		Product tissue = new Product(20, 2.00, "Tissue");
		Product pencil = new Product(70, 0.50, "Pencil");
		
		int n = sc.nextInt();
		switch (n) {
		case 0:
	    break;
		case 1:
			//Ahmad buy 3 unit of bag
			ahmadWallet.pay(bag.buy(3));
			System.out.println(df.format(ahmadWallet.getBalance()));
	    break;
		case 2:
			//JingXi buy 10 units of Tissue
			jingxiWallet.pay(tissue.buy(10));
			System.out.println(df.format(jingxiWallet.getBalance()));
	    break;
		case 3:
			//Ahmad transfers RM10.00 to JingXi
			ahmadWallet.transferTo(jingxiWallet, 10.00);
			System.out.println(df.format(ahmadWallet.getBalance()));
	    break;
		case 4:
			jingxiWallet.transferTo(ahmadWallet, 20.00);
			System.out.println(df.format(jingxiWallet.getBalance()));
		break;
		}
	}

}
