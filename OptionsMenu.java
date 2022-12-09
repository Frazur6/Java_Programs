package banking;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.InputMismatchException;


public class OptionsMenu extends Transactions
{
	
	NumberFormat df = NumberFormat.getCurrencyInstance();
	
	Scanner menuInput = new Scanner(System.in);
	
	HashMap<Integer, Integer> accthash = new HashMap<Integer, Integer>();
	
	
	public void login() 
	{
		int x=1;
		
		do 
		{
			try 
			{
				accthash.put(1001001, 1234);
				accthash.put(2002001, 2345);
				accthash.put(100, 456);
				
				System.out.println("Welcome to National Bank");
				System.out.println("Please Enter Your Account Number: ");
				setAcctNumber(menuInput.nextInt());
				
				System.out.println("Please Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());												
			  }
			
			catch(InputMismatchException e) 
			{
				System.out.println("Please Enter Only Numbers");
				x = 2;
			}
			
		    int acctNumber = getAcctNumber();
		    int pinNumber = getPinNumber();
		    
		    if( accthash.containsKey(acctNumber) && accthash.get(acctNumber) == pinNumber)
		    {
		    	getAccountType();		    
		    }
		    else 
		    {
		    	System.out.println("You Entered the Incorrect Account or Pin Number");
		    }
		}
		while (x == 1);
	}
	
	
	public void getAccountType() 
	{
		System.out.println("Enter 1 for Checking, 2 for Savings, or 3 to Exit Menu");
		
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
			case 1:
				getChecking();
				break;
			case 2:
				//getSavings();
				break;
			case 3:
				System.out.println("Thank You for Coming");
				System.exit(0);
			default:System.out.println("Please Make a Valid Selection");						
		}
	}
		
		
	public void getChecking()
	{
		System.out.println("You have Selected Your Checking Account");	
		System.out.println("Type 1 to View Balance");	
		System.out.println("Type 2 to Deposit Funds");	
		System.out.println("Type 3 to Withdraw");	
		System.out.println("Type 4 to Exit");	
		System.out.println("Please Enter Your Selection:  ");	
		
		int selection = menuInput.nextInt();
		
		
		switch(selection)
		{
			case 1:
				System.out.println("Your Checking Balance is: " + df.format(checkBalance));	
				getAccountType();
				break;
			case 2:
				getDepositAmt(); 
				getAccountType();
				break;
			case 3:
				getWithdrawAmt();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank You for Coming");
				System.exit(0);
			default:System.out.println("Please Make a Valid Selection");						
		}
		
		
	}

	
	
	
	
	
	
	
}
