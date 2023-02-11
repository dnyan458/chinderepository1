package Inheritance;

class Bank
{
	int accno;
	Bank(int a)
	{
		accno=a;
	}
}
	class SBH extends Bank
	{
	int accno;
	String name;

	SBH(int a, String s)
	{
		super(a);
		name=s;
	}
}
	class SBI extends SBH
	{
		int accno;
		String name;
		int panno;

		SBI(int  a,int r,String s)
		{
		super(a,s);
		panno=r;
		System.out.println("Acco No :"+a);
		System.out.println("Name :"+s);
		System.out.println("Panno :"+panno);

		}
}
public class super_keywords
{
	public static void main(String[] args)
	{
		SBI s = new SBI(21, 20, "Bank of india");

}
}