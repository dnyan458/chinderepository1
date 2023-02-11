package New;

import java.util.Scanner;

public class revrse_number
{
	public static void main(String[] args)
	{
		int n,r;
		System.out.println("enter any number");
		Scanner s  =new Scanner(System.in);
		n=s.nextInt();

		while(n>0)
		{
			r=n%10;

			n=n/10;
			System.out.print(r);
		}

	}

						}
