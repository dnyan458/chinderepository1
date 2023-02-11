package Number_demo;

import java.util.Scanner;

public class print_all_odd_numbers {


	public static void main(String[] args)
{
		 int n;
		 System.out.println("enter no of term:");
		 Scanner s = new Scanner(System.in);
		 n = s.nextInt();
		 for(int i=1;i<=n;i=i+2)
		 System.out.println(i + "");
		 }




	}


