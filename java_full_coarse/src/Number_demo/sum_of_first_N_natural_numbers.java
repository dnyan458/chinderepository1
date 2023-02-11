package Number_demo;

import java.util.Scanner;

public class sum_of_first_N_natural_numbers
{
public static void main(String[] args)
{
	 int n,sum=0;
	 System.out.println("enter no of term :");
	 Scanner s = new Scanner(System.in);
	 n = s.nextInt();

	 for(int i=1;i<=n;i++)
	 {
		 sum=sum+i;
	 }
	 System.out.println("add >"+sum);
}

}
