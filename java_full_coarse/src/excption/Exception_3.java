package excption;

public class Exception_3
{

	public static void main(String[] args)
	{
		try
		{
			/*
			 * int a=30,b=0,c; c=a/b;
			 */
			/*
			 * int a[]=new int[4]; a[12]=34;
			 */
			String str = null;
			System.out.println(str.length());
			}
      catch(ArithmeticException e)
      {
    	 System.out.println("Arithmatic exception occures");
      }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrayindexoutofbounds exception occurers");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception cought ");
			}
		   catch(Exception e)
		{
			   System.out.println("I am in exception"+e);
		}
	}
	}
