package practice;

import java.util.Scanner;

public class Else_if
{

	public static void main(String[] args)
	{
		int marks;
		System.out.println("enter marks :");
		Scanner s =new Scanner(System.in);
		marks =s.nextInt();
		if(marks>=60 && marks<=100)
		{
			System.out.println("First Divison");
		}
		else if(marks >=45 && marks<60 )
		{
			System.out.println("Second Divison");
		}
		else if(marks>=33 && marks<45)
		{
			System.out.println("Third Divison");
		}
		else
		{
			System.out.println("Failed....");
		}

	}

}
