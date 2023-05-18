import java.text.DecimalFormat;
import java.util.Scanner;

//Chua Siong Yong - 1201200341
//Group TL1V
//Lab 5A / Question 1

public class TestSalesExecutive {

	public static void main(String[] args) {
		Scanner Lab5AS1 = new Scanner (System.in);
		DecimalFormat df2 = new DecimalFormat("0.00");
		DecimalFormat df1 = new DecimalFormat("0.0");
		
		System.out.print("Enter Staff Name\t: ");
		String name = Lab5AS1.next();
		System.out.print("Enter Staff ID\t\t: ");
		String ID = Lab5AS1.next();
		System.out.print("Enter Basic Pay\t\t: $ ");
		double basicPay = Lab5AS1.nextDouble();
		
		SalesExecutive SE = new SalesExecutive(name, ID, basicPay);
		
		System.out.println("\nPart 1: Sales Collections");
		System.out.print("\nHow many months? ");
		int num = Lab5AS1.nextInt();
		System.out.println("Enter the Collection of sales for each month: ");
		
		double[] allSales = new double[num];
		
		for (int i = 0; i < num; i++)
		{
			System.out.print("Month " + (i + 1) + " = $ ");
			allSales[i] = Lab5AS1.nextDouble();
			SE.setSales(allSales);
		}
		
		System.out.println("Average Sales: $ " + df2.format(SE.getAverageSales()));
		
		int num_peers = 3;
		int[] allpeerReview = new int[num_peers];
		System.out.println("\nPart 2: Peer Review (" + num_peers + " peers)");
		System.out.println("Enter the assessment point from "+ num_peers + " peers: [1 - 5]");
		
		for(int i = 0; i < num_peers; i++)
		{
			System.out.println("Peer " + (i + 1) + " = ");
			allpeerReview[i] = Lab5AS1.nextInt();
			SE.setPeerReview(allpeerReview);
		}
		
		System.out.println("Average Review Points from Peers: " + df2.format(SE.getAveragePeerReview()));
		
		System.out.println("Calculating Bonus & Total Salary of Sales Executive");
		System.out.println("Staff ID: " + ID);
		System.out.println("Staff Name: " + name);
		System.out.println("Basic Salary: " + df2.format(basicPay));
		System.out.println("Percentage of the sales commission: " + df1.format((SE.getCommisionRate() * 100)) + " %");
		System.out.println("Bonus Percentage from Peer Reviews: " + df1.format((SE.getPeerReviewRate()) * 100) + " %");
		System.out.println("Bonus Amount from Sales Collection: $ " + df2.format((basicPay * SE.getCommisionRate() ) ));
		System.out.println("Bonus Amount from Peer Reviews: $ " + df2.format((basicPay * SE.getPeerReviewRate() ) ));
		System.out.println("Total Salary: $ " + df2.format(SE.getSalary()));
		
		Lab5AS1.close();
	}

}
