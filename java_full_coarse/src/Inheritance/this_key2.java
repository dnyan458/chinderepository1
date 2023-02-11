package Inheritance;

  public class this_key2
{
	  public this_key2()
	{
		System.out.println("i am in  defaoult constructor");
	}

	  public this_key2(int x)
	 {

		 System.out.println("parameterised constructor :"+x);
	 }

	 public static void main(String[] args)
	 {
		this_key2 s =new  this_key2();
		this_key2 s2= new this_key2(10);
	}

}
