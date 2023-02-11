package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2_sort_order
{

	public static void main(String[] args)
	{

		     int a[]= new int[5];
		     System.out.println("Enter Array Element: ");
		      Scanner s = new Scanner(System.in);
		     for(int i=0;i<5;i++)
		     {
		    	a[i]=s.nextInt();
		     }
		     Arrays.sort(a);
		    	System.out.println("sorted Arrays Elements:");

		     for(int b:a)
		     {
		    	System.out.print(b+" ");
		     }

	}

}
