import java.util.Scanner; 
import java.text.DecimalFormat; 
public class MyPrintCardApp { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		double amt; int N = sc.nextInt(); 
		int x = 1; 
		do { 
			System.out.println("Case #" + x + ":"); 
			MyPrintCard card = new MyPrintCard(); 
			for (int i = 1; i <= N; i++) { 
				char ch = sc.next().charAt(0); 
				if (ch == '=') 
					System.out.println(card.toString()); 
				else if (ch == '-') { 
					amt = sc.nextDouble(); 
					if (card.payService(amt)) 
						System.out.println(card.toString()); 
					else 
						System.out.println("invalid"); 
				} 
				else if (ch == '+') { 
					amt = sc.nextDouble(); 
					card.topupCard(amt); 
					System.out.println(card.toString());
				} 
			} 
			N = sc.nextInt(); 
			x++; 
		}
		while (N != 0); 
	} 
} 

