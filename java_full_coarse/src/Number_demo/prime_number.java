package Number_demo;

import java.util.Scanner;

//input number  11---> prime number
 class prime_number
{

	public static void main(String[] args)
	{
     int n, count=0;
     System.out.println("Enter number :");
     Scanner s =new Scanner(System.in);
     n=s.nextInt();

     for(int i=1;i<=n;i++)
     {
    	 if(n%i==0)
    	 {
    		 count++;
    	 }
     }
    	 if(count==2)
    	 {
    		 System.out.println("Prime number");
    	 }

    	 else
    	 {

     System.out.println("not prime number");
	}
 	}
}
