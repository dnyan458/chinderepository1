package Inheritance;

public class final_keyword
{
	//final int a=20;
	int a=20;
	void dis()
	{
		System.out.println("a :"+a);
		a=a+10;
		System.out.println("a :"+a);
	}
   public static void main(String[] args)
   {
	final_keyword s=new  final_keyword();
	s.dis();
}
}
