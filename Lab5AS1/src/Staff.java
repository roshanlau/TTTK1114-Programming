//Chua Siong Yong - 1201200341
//Group TL1V
//Lab 5A / Question 1

public class Staff
{
	private String staffName;
	private String staffID;
	private double salary;
	
	public Staff(String name, String ID, double basicPay)
	{
		this.staffName = name;
		this.staffID = ID;
		this.salary = basicPay;
	}
	
	public String getName()
	{
		return this.staffName;
	}
	
	public String getID()
	{
		return this.staffID;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
}
