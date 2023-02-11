package practice;

import java.util.Scanner;

public class do_while
{

	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any number : ");
        Scanner s = new Scanner(System.in);
        num =s.nextInt();

         do       //num=56;
         {
        	 System.out.println(num);
        	 num++;
         }
         while(num<=10); //56<=10
         {

         }
        }


}
