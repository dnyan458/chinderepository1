package strings;

public class demo
{

	public static void main(String[] args)
	{
		String str ="dnyan";
		String str2="Dnyan";

		if(str.equals(str2))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not");
		}
      System.out.println(str.trim().replaceFirst(str, str2));
	}

}
