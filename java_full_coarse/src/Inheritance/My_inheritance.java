package Inheritance;


	class AAA
	{
		void methodA()
		{
			System.out.println("i am in method AAA");
		}

	}
	class BBB extends  AAA
	{
	 void methodB()
		{
		System.out.println("i am in  method BBB ");
	}
	}
	public class My_inheritance
	{
   public static void main(String[] args)
   {
	   BBB b = new BBB();
	   b.methodA();
	   b.methodB();

 }
}
