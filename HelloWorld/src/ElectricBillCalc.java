import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;

public class ElectricBillCalc {
	
	public static double getST(double elecUnit) {
		if (elecUnit > 600) {
			return (((elecUnit - 600) * 0.5460) - (elecUnit - 600) * 0.02) * 0.06;
		} else {
			return 0.00;
		}

	}

	public static double getRebat(double elecUnit) {
		return elecUnit * (-0.02);
	}

	public static double getKWTBB(double total) {
		return total * 0.016;
	}

	public static double getBill(double elecUnit) {
		double total = 0;
		if (elecUnit <= 200) {
			total = elecUnit * 0.2180;
		} else if (elecUnit <= 300) {
			total = 200 * 0.2180;
			total = total + ((elecUnit - 200) * 0.3340);
		} else if (elecUnit <= 600) {
			total = 200 * 0.2180;
			total = total + (100 * 0.3340);
			total = total + ((elecUnit - 300) * 0.5160);
		} else if (elecUnit <=900){
			total = 200 * 0.2180;
			total = total + (100 * 0.3340);
			total = total + (300 * 0.5160);
			total = total + ((elecUnit - 600) * 0.5460);
		}else {
			total = 200*0.2180;
			total = total + (100 * 0.3340);
			total = total + (300 * 0.5160);
			total = total + (300 * 0.5460);
			total = total + ((elecUnit - 900) * 0.5460);
		}

		return total;
	}

	public static double getRounded(String bill) {
		int lastDigit = bill.charAt(bill.length() - 1) - 48;
		int remainder = lastDigit % 5;
		if (remainder == 1) {
			return -0.01;
		} else if (remainder == 2) {
			return -0.02;
		} else if (remainder == 3) {
			return 0.02;
		} else if (remainder == 4) {
			return 0.01;
		} else {
			return 0.00;
		}

	}

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		FileWriter fw = new FileWriter("ElectricBill.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		int count = 1;
		double[] historyBill = new double[100];
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.println("Enter previous bill:");
			double previousBill = sc.nextDouble();
			
			System.out.println("Enter Previous Electric Unit Meter Reading:");
			double previousUnit = sc.nextDouble();
			while (previousUnit < 0) {
				System.out.println("Error, Please Enter a Positive Value: ");
				previousUnit = sc.nextDouble();
			}
			
			System.out.println("Enter Current Electric Unit Meter Reading:");
			double currentUnit = sc.nextDouble();
			while (currentUnit < previousUnit) {
				System.out.println("Error, Please Enter a Value Bigger Than " + df.format(previousUnit) + ": ");
				currentUnit = sc.nextDouble();
			}

			double elecUnit = currentUnit - previousUnit;
			double total = getBill(elecUnit);
			double serviceTax = getST(elecUnit);
			double rebat = getRebat(elecUnit);
			double rebatTotal = total - rebat;
			double KWTBB = getKWTBB(total);
			double netTotal = total + rebat + serviceTax + KWTBB;
			double toRound = getRounded(df.format(netTotal));
			double totalBill = previousBill + netTotal + toRound;
			historyBill[count-1] = totalBill;
			
			pw.println("#BILL NUMBER " + count + "#");
			pw.println("Tunggakan\t\t\t:	RM " + df.format(previousBill));
			pw.println("Caj Semasa\t\t\t:	RM " + df.format(netTotal));
			pw.println("Penggenapan\t\t\t:	RM " + df.format(toRound));
			pw.println("Jumlah Bil\t\t\t:	RM " + df.format(totalBill));
			pw.println();
			pw.println("KETERANGAN:-");
			pw.println("Kegunaan kWh\t\t\t:	   " + df.format(elecUnit));
			pw.println("Kegunaan RM\t\t\t:	RM " + df.format(total));
			pw.println("Rebat ICPT (RM0.02/kWh)\t\t:	RM " + df.format(rebat));
			pw.println("Kegunaan Bulan Semasa\t\t:	RM " + df.format(rebatTotal));
			pw.println("Service Tax (6%)\t\t:	RM " + df.format(serviceTax));
			pw.println("KWTBB (1.6%)\t\t\t:	RM " + df.format(KWTBB));
			pw.println("Caj Semasa\t\t\t:	RM " + df.format(netTotal));
			pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			System.out.println("TOTAL BILL : RM " + df.format(totalBill));
			System.out.println("Do you want to calculate the electrical bill again? (Y/N)");
			char ans = sc.next().charAt(0);
			
			while (ans != 'Y' && ans != 'y' && ans != 'N' && ans != 'n') {
				System.out.println("Error, Please enter either Y or N");
				ans = sc.next().charAt(0);
			}
			if (ans == 'Y' || ans == 'y') {
				repeat = true;
			} else if (ans == 'N' || ans == 'n') {
				repeat = false;
				
			}
			count++;
		}
		for(int i = 0; i < count-1; i++) {
			pw.println("Bill " + (i+1) + " :\tRM" + df.format(historyBill[i]) );
		}
		pw.close();
		System.out.println("Output Receipt Completed.");
		
	}

}
