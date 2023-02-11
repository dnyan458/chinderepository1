package practice;

import java.util.Scanner;

public class If_else
{

	public static void main(String[] args)
	{
		/*
		 * int pwd;
		 *
		 * System.out.println("Enter password :=");
		 *
		 * Scanner s = new Scanner(System.in); pwd=s.nextInt();
		 *
		 * if(pwd==2731) //2731==2731 {
		 * System.out.println("My name : chinde dnyaneshwer");
		 * System.out.println("My Age : 24");
		 * System.out.println("My contact : 8788259558");
		 * System.out.println("My adress : panchaavti nagar, latur"); } else {
		 * System.out.println("Sorry Wrong Password"); }
		 *
		 * } }
		 */

int Age;

System.out.println("Enter passcode :=");

Scanner s = new Scanner(System.in);
Age=s.nextInt();

if(Age>=18) //2731==2731
{
	System.out.println("My name : chinde dnyaneshwer");
    System.out.println("My Age : 24");
    System.out.println("My contact : 8788259558");
    System.out.println("My adress : panchaavti nagar, latur");
}
else
{
	System.out.println(" Sorry u r not eligible for voting");
}
}}