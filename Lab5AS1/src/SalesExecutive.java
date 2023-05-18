//Chua Siong Yong - 1201200341
//Group TL1V
//Lab 5A / Question 1

public class SalesExecutive extends Staff
{
	private double[] sales;
	private int[] peerReview;
	private double avgSales;
	private double avgReview;
	
	public SalesExecutive(String name, String ID, double basicPay)
	{
		super(name, ID, basicPay);
	}
	
	public void setSales (double[] allSales)
	{
		sales = allSales;
	}
	
	public void setPeerReview (int[] allpeerReview)
	{
		peerReview = allpeerReview;
	}
	
	public double getAverageSales()
	{
		
		for (int i = 0 ; i < sales.length; i++)
		{
			avgSales += sales[i];
		}
		avgSales /= sales.length;
		
		return avgSales;
	}
	
	public double getCommisionRate()
	{
		double commission = 0.0;
		
		if (avgSales < 7000)
		{
			commission = 0.0;
		}
		else if (avgSales >= 7000 && avgSales <= 10000)
		{
			commission = 0.1;
		}
		else if (avgSales > 10000 && avgSales <= 15000)
		{
			commission = 0.15;
		}
		else if (avgSales > 15000)
		{
			commission = 0.2;
		}
		
		return commission;
	}
	
	public double getAveragePeerReview()
	{
		for (int i = 0; i < peerReview.length; i++)
		{
			avgReview += peerReview[i];
		}
		avgReview /= peerReview.length;
		
		return avgReview;
	}
	
	public double getPeerReviewRate()
	{
		double assessment = 0.0;
		
		if (avgReview >= 4.00 && avgReview <= 5.00)
		{
			assessment = 0.05;
		}
		
		else if (avgReview >= 3.00 && avgReview <= 3.99)
		{
			assessment = 0.025;
		}
		
		else if (avgReview >= 2.50 && avgReview <= 2.99)
		{
			assessment = 0.01;
		}
		
		else if (avgReview < 2.50)
		{
			assessment = 0.00;
		}
		
		return assessment;
	}
	
	public double getSalary()
	{
		double total = 0.0;
		total = (super.getSalary() * getCommisionRate()) + 
				(super.getSalary() * getPeerReviewRate()) + 
				super.getSalary();
		
		return total;
	}
}
