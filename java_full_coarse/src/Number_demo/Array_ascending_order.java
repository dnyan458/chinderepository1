package Number_demo;

import java.util.Scanner;
// value = 14 10 20 30 40
// index = 0  1  2  3  4
public class Array_ascending_order
{
public static void main(String[] args)
{
	int temp;
	int a[]= new int[5];
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Array  numbers : :");

	for(int i=0;i<5;i++)//i=0,1,2,3,4;
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)//j=1,2,3,4,5
		{
			if(a[i]>a[j])//14>1-
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
}
	for(int i=0;i<5;i++)
	{
	System.out.println(a[i]+"");//10,20,30,40
}

for(int i=a.length-1;i>=0;i--)
{
	System.out.println(a[i]);
	}
}
}