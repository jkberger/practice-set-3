import java.util.Scanner;
import java.util.Date;

package ps3;

public class Account 
{
	private int id = 0;
	private double balance = 0;
	private double annualinterestRate = 0;
	private Date dateCreated;
	
	
	public Account()
	{
		
	}

	public Account(int id1, double annualinterestRate1, double balance1)
	{
		id = id1;
		balance = balance1;
		annualinterestRate = annualinterestRate1;
		dateCreated = new Date();
	}
	
	public void setid(int id1)
	{
		id = id1;

	}
	
	public int getid()
	{
		return id;
	}
	
	public void setbalance(double balance1)
	{
		balance = balance1;
		
	}
	
	public double getbalance()
	{
		return balance;	
	}
	
	public void setannualinterestRate(double annualinterestRate1)
	{
		annualinterestRate = annualinterestRate1;
		
	}
	
	public double getannualinterestRate()
	{
		return annualinterestRate;
		
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
		
	}
	
	public double getMonthlyInterestRate()
	{
		return annualinterestRate /  12;
		
	}
	
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount <= balance)
		{
		   balance -= amount;
		}
		   else
		   {
			   double needs = amount - balance;
		       throw new InsufficientFundsException(needs);	
		   }
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		
	}
}	

	