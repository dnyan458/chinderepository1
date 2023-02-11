package excption;

public class Exeception_Arithmatic
{
	public static void main(String[] args)
	{

    int a=20,b=0,c=100;
    try
    {
     c=a/b;
     System.out.println("Value of C :"+c);
	}
	catch( ArithmeticException e)
	{
		System.out.println(e);
	}
}
}