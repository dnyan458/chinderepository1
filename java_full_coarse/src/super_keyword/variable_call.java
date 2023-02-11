package super_keyword;

 class vars
{
	int a=20;
}
	class B extends vars
	{
		int a=30;

	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	}
	 public class variable_call
	 {
	public static void main(String[] args)
	{

     B s = new B();
    s.show();
	}

}
