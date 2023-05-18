import java.util.*;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		int prodUnit = sc.nextInt();
		double prodPrice = sc.nextDouble();
		String prodName = sc.nextLine();
		Product bag = new Product (prodUnit, prodPrice, prodName);

		int action = sc.nextInt();
		switch (action) {
		case 0: System.out.println(bag);
			    break;
		case 1: n = sc.nextInt();
			    System.out.println("RM"+bag.buy(n)+":"+bag.getStock());
			    break;
		case 2: n=sc.nextInt(); bag.topupStock(n);
			    System.out.println(bag.getStock());
			    break;
		case 3: System.out.println(bag.getName());
			    break;     
		}
		
		
	}

}
