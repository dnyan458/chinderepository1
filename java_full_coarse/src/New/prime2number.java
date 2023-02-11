package New;

import java.util.Scanner;

public class prime2number
{

	public static void main(String[] args)
	{
  int n,count=0,i;
  Scanner s = new  Scanner(System.in);
  System.out.println("Enter number");
  n=s.nextInt();

 for(i=1;i<=n;i++)
 {
		 if(n%i==0)
		 {
	 count++;

	}
 }
if(count==2)
{

System.out.println("prime number");
}
else
{
System.out.println("not prime number");
}
 }}