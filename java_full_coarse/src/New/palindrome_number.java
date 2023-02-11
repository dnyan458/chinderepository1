package New;

import java.util.Scanner;

//input number 121 ---> 121
public class palindrome_number
{

	public static void main(String[] args)
	{
    int n,c,r,s=0;

    System.out.println("enter any no :");
    Scanner ref = new Scanner(System.in);
    n= ref.nextInt();
     c=n;
    while(n>0)
    {
    	r =n%10;
    	s=(s*10)+r;
    	n=n/10;

    }
    if(c==s)
    {
    	System.out.println("Palindrone number");
    }
    else
    {
    	System.out.println("palindrone is not number ");
    }
	}

}
