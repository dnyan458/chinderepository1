package Abstraction;

import java.util.Scanner;

abstract class Bank
{
	public String Name="myBank";
	public String IFSC="myBank123";

public void BankDetail()
{
	System.out.println("Bank Name: "+Name+""+"Bank_IFSC Code:  "+IFSC);
}
//password=123
   abstract void Deposite();  //abstract does not have body
   abstract void Withdraw();
   abstract void Check_bal();
}
class Bank_Services extends Bank
{
	private double bal=5000;
	private int pwd;
	public double money;

@Override
public void Deposite()
{
	System.out.println("Enter Password: ");
	Scanner s =new Scanner(System.in);
	pwd=s.nextInt();
	if(pwd==123)
	{
		System.out.println("Enter Depsote Amount: ");
		money=s.nextDouble();
		bal=bal+money;
		System.out.println("depostied money: "+money);
		System.out.println("total bal: "+bal);
	}
	else
	{
		System.out.println("Invalid password");
	}
	}
@Override
public void Withdraw()
{
	System.out.println("Enter Password: ");
	Scanner s =new Scanner(System.in);
	pwd=s.nextInt();
	if(pwd==123)
	{
		System.out.println("Enter Withdraw Amount: ");
		money=s.nextDouble();
		bal=bal-money;
		System.out.println("Withdrawl money: "+money);
		System.out.println("total bal: "+bal);
	}
	else
	{
		System.out.println("Invalid password");
	}
}
@Override
public void Check_bal()
{
	System.out.println("Enter Password: ");
	Scanner s =new Scanner(System.in);
	pwd=s.nextInt();
	if(pwd==123)
	{

		System.out.println("total bal: "+bal);
	}
	else
	{
		System.out.println("Invalid password");
	}
}
}
class Customer
{
	public static void main(String[] args)
	{
	Bank_Services d = new Bank_Services();
	d.BankDetail();
	int ch;
    System.out.println("1.Deposite: ");
    System.out.println("2.Withdraw: ");
    System.out.println("3.Check_balance: ");

    System.out.println("Enter your choice: ");
    Scanner s2 = new Scanner(System.in);
    ch=s2.nextInt();

    	switch(ch)
    	{
    	case 1: d.Deposite();
    	break;
    	case 2: d.Withdraw();
    	break;
    	case 3: d.Check_bal();
    	break;
    	default:System.out.println("invalid choice:");

	}
	}
}
