package Number_demo;

import java.util.Scanner;

public class natural_number
{

	public static void main(String[] args)
	{
		 int n;
	      System.out.println("enter any number :");
	      Scanner s = new Scanner(System.in);
	      n = s.nextInt();

	      for(int i=1;i<=n;i++)
	      {
	    	  System.out.print( i+" ");
	      }
	}

}
