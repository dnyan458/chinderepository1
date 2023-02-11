package Number_demo;

import java.util.Scanner;

//input a[5]=10,20,30,40,50 ---> 50,40,30,20,10
public class Array_reverse_order
{

	public static void main(String[] args)
	{
      int a[] = new int[5];
     Scanner s=new Scanner(System.in);
     System.out.println("enter  elements in array :");

     for(int i=0;i<a.length;i++)
     {
    	 a[i] =s.nextInt();
     }
     System.out.println("Array element :");
     for (int element : a) {
    	 System.out.println(element+" ");
     }
     System.out.println("Array element reverse  :");
     for(int i=a.length-1;i>=0;i--)
     {
    	 System.out.println(a[i]+" ");
     }
	}

}
