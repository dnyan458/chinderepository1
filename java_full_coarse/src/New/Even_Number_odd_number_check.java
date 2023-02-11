package New;

import java.util.Scanner;

public class Even_Number_odd_number_check
{

	public static void main(String[] args)
	{
     int n;
     System.out.println("Enter number:");
     Scanner r = new  Scanner(System.in);
     n=r.nextInt();
     if(n%2==0)
     {
    	 System.out.println("Even number");
     }
     else
     {
    	 System.out.println("odd number ");
     }
	}

}
