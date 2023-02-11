package Number_demo;

import java.util.Scanner;

public class finf_factorial_using_recursion
{

	public static void main(String[] args)
	{
      int n;
      System.out.println("enter any number :");
      Scanner s = new Scanner(System.in);
      n = s.nextInt();//n=3
      finf_factorial_using_recursion obj = new finf_factorial_using_recursion();
     int result =obj.fact(n);//fact (3)
      System.out.println("factorial given  number :"+result);
	}
	int fact(int n)//n=3
	{
	  if(n==1)
	return 1;
	  else
		return  n*fact(n-1);//3*fact(2)
	}
}
/*	int fact(int n)//n=2
	{
	  if(n==1)
	return 1;
	  else
		return  n*fact(n-1);//3*fact(1)
	}
	int fact(int n)//n=1
	{
	  if(n==1)
	return 1;
	  else
		return  n*fact(n-1);//3*fact(2)
*/	//}

//}
