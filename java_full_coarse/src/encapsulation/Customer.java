package encapsulation;

import java.util.Scanner;

class Bank
{
	private int pwd;
	private double bal=5000;

	public void Deposite(double money)
	{
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal+money;
			System.out.println("Deposited money: "+money);
			System.out.println("Total bal: "+bal);
		}
		else
		{
			System.out.println("incoorect password: ");
		}
	}
		public void Withdraw(double money)
		{
			System.out.println("Enter Password");
			Scanner s = new Scanner(System.in);
			pwd=s.nextInt();
			if(pwd==123)
			{
				bal=bal-money;
				System.out.println("Deposited money: "+money);
				System.out.println("Total bal: "+bal);
			}
			else
			{
				System.out.println("incoorect password: ");
			}
		}
	     public void Check_bal()
	     {
	    	 System.out.println("Enter Password");
	 		Scanner s = new Scanner(System.in);
	 		pwd=s.nextInt();
	 		if(pwd==123)
	 		{

	 			System.out.println("Total bal: "+bal);
	 		}

	     }
	}

 class Customer
 {

	public static void main(String[] args)
	{
        Bank f = new Bank();
        int ch;
        System.out.println("1.Deposite: ");
        System.out.println("2.Withdraw: ");
        System.out.println("3.Check_balance: ");

        System.out.println("Enter your choice: ");
        Scanner s2 = new Scanner(System.in);
        ch=s2.nextInt();

        	switch(ch)
        	{
        	case 1: f.Deposite(1000);
        	break;
        	case 2: f.Withdraw(2000);
        	break;
        	case 3: f.Check_bal();
        	break;
        	default:System.out.println("invalid choice:");
        	}

        }
	}
