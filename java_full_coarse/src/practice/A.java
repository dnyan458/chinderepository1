package practice;

import java.util.Scanner;

public class A
{

	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("add  any two numbers :");

		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
        c=a+b;

        System.out.println("sum of two numbers ="+c);
	}

}
