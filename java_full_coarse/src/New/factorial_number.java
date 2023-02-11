package New;

import java.util.Scanner;

// input ---->120(5*4*3*2*1)
public class factorial_number
{

	public static void main(String[] args)
	{
   int n,fact=1;
   System.out.println("enter no :");

   Scanner s = new Scanner(System.in);
   n= s.nextInt();
   for (int i=1;i<=5;i++)
   {
	   fact =fact*i;
   }
   System.out.println("factorial :"+fact);
	}

}
