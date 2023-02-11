package excption;

public class Exception_2
{
public static void main(String[] args)
{
	try
	{
	int a[] =new int[5];
	 a[5]=12;

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Hi......");
		System.out.println("i AM in finally");
	}
}
}