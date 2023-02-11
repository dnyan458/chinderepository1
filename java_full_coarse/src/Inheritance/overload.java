package Inheritance;

public class overload
{
	void sum(int a)
	{
		System.out.println(a+a);
	}
	void sum(double a)
	{
		System.out.println(a*a);
	}
	void  sum(int a ,double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
       overload O = new overload();
       O.sum(10);
       O.sum(10.0);
       O.sum(10, 10);

       }

}
