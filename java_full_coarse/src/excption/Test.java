package excption;

public class Test
{

	public static void main(String[] args)
	{
           System.out.println("Main Method Started");
           try
           {
           int a=10,b=0,c;
           c=a/b;//c=10/0;
           System.out.println(c);
           }
           catch(ArithmeticException e)
           {
        	   System.out.println("cant devide by zero");
           }
           System.out.println("Main Method Ended");

	}

}
