package practice;

import java.util.Scanner;

public class Switch_statment
{

	public static void main(String[] args)
	{
		int a,b,c,ch;
		System.out.println("Enter Any two Number :");
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:c=a+b;
		System.out.println("Addition :"+c);
		break;
		case 2:c=a-b;
		System.out.println("substraction"+c);
		break;
		case 3:c=a*b;
		System.out.println("Substraction"+c);
		break;
		case 4:c=a/b;
		System.out.println("division"+c);
		break;
		case 5:c=a%b;
		System.out.println("Reminder"+c);
		break;
		default :System.out.println("invalid choice...");
		}

	}

}
