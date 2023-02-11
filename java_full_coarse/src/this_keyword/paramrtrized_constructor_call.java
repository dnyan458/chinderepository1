package this_keyword;

class g
{
g()
{
	//this(100);//not output when this keyword not used in constructor
	}
g(int a)
{
	System.out.println(a);
	}
}




public class paramrtrized_constructor_call
{

	public static void main(String[] args)
	{
		g  H = new g();

	}

}
