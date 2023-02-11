package Number_demo;

import java.util.Scanner;

public class print_all_even_numbers

{
	public static void main(String[] args)
{
		 int n;
		 System.out.println("enter no of term :");
		 Scanner s = new Scanner(System.in);
		 n = s.nextInt();
		 for(int i=0;i<=n;i=i+2)
		 System.out.println(i+" ");
}

}
