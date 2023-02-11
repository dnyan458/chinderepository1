package array;


public class static_block
{
	 int b=10;static int a=20;
	static // it not need object creat
	// it access only static keyword so used static keyword on variables
	{
		System.out.println("Learn Coding");
		//System.out.println(b);//it error show becouse i dont use static keyword on b
		System.out.println(a);
	}

	public static void main(String[] args)
	{
static_block s = new static_block();
}

}
