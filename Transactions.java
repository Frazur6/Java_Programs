package banking;

import java.util.Scanner;
import java.text.NumberFormat;

public class Transactions
{
	
	NumberFormat df = NumberFormat.getCurrencyInstance();
	
	private int acctNumber;
	private int pinNumber;
	
	public double checkBalance = 0;
	public double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	
	
	//Set and Get the Account Number
	public int setAcctNumber(int acctNumber) 
	{
		this.acctNumber = acctNumber;
		return acctNumber;
	}
	
	public int getAcctNumber() 
	{
		return acctNumber;
	}
	
	
	//Set and Get the Pin Number
	public int setPinNumber(int pinNumber) 
	{
		this.pinNumber= pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() 
	{
		return pinNumber;
	}
	
	
	// Go to Checking or Savings Account
	public double getCheckingBalance() 
	{
		return checkBalance;
	}
	
	public double getSavingBalance() 
	{
		return checkBalance;
	}
	
	
	 //Deposit
	  public double deposit(double amount) 
	  {
		  checkBalance = checkBalance + amount;
		  return checkBalance;
		  //System.out.println("Deposit Complete");
	  }
	  
	  public double withdraw(double amount) 
	  {
		  checkBalance = checkBalance - amount;
		  return checkBalance;
		  //System.out.println("Deposit Complete");
	  }
	
	  public void getDepositAmt() 
	  {
		  System.out.println("Enter the Amount to Deposit: ");
		  double amount = input.nextDouble();
		  
		  if ((checkBalance + amount) > 0)
		  {
			  deposit(amount);
			  System.out.println("Checking Account Balance is: " + df.format(checkBalance));
		  }
		  else 
		  {
			 System.out.println("Please Enter a Positive Amount");
		  }
	  }
	  
	  public void getWithdrawAmt() 
	  {
		  System.out.println("Enter the Amount to Deposit: ");
		  double amount = input.nextDouble();
		  
		  if (amount<=checkBalance)
		  {
			  withdraw(amount);
			  System.out.println("Checking Account Balance is: " + df.format(checkBalance));
		  }
		  else 
		  {
			  System.err.println("Insufficient Funds: Transaction Cancelled");
		  }
	  }
}
