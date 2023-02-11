package New;

import java.util.Scanner;
//input number --->Prime number
public class Prime_Number
{

	public static void main(String[] args)
	{
		int n;

		int count = 0;
		System.out.println("Enter Any Number :");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();

		for(int i=1;i<=2;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Prime number :");
		}
		else
		{
			System.out.println("Not prime number");
		}
	}

}
