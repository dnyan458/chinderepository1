package Number_demo;

import java.util.Scanner;

// 0 1 1 2 3 5 8 13
public class fibbonaci_series
{

	public static void main(String[] args)
	{
		int term,a=0,b=1,c;
		System.out.println("Enter term :");
		Scanner s = new Scanner(System.in);
		term=s.nextInt();

		for(int i=1;i<=term;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;

	}

	}
}