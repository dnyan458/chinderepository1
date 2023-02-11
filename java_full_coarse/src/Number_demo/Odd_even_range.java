package Number_demo;

import java.util.Scanner;

//Even 10(0+2+4+6+8+10=30)
//Odd 11(1+3+5+7+9+11=36)
  public class Odd_even_range
{

	public static void main(String[] args)
	{
    int n,i,sum=0;
    System.out.println("enter range :");
    Scanner s = new Scanner(System.in);
      n= s.nextInt();

      if(n%2==0)
      {
    	  for(i=0;i<=10;i=i+2)
    	  {
    		sum=sum+i;
    	  }
    	  System.out.println("sum of even no :"+sum);
      }
      else
      {
    	  for(i=1;i<=11;i=i+2)
    	  {
    		  sum=sum+i;
    	  }
    	  System.out.println("sum of odd nu :"+sum);
      }
	}

}
