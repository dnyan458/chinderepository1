package Number_demo;

import java.util.Scanner;
//factorial 5 --->120(5*4*3*2*1)
public class factorial_number
{

	public static void main(String[] args)
	{ int n,fact=1;
    System.out.println("enter any number :");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();//n=3

    for(int i=1;i<=n;i++)
    {
    	fact=fact*i;
    }
      System.out.println("fact -->"+fact);
	}

}
