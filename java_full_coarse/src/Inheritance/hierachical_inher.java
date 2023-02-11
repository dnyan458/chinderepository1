package Inheritance;

class A
{
	void Input()
	{
		System.out.println("input");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("show");
	}
}
class C extends A
{
	void dis()
	{
		System.out.println("dis");
	}
}
public class hierachical_inher
{

	public static void main(String[] args)
	{
          C  s = new C();
          B s2= new B();
          s.Input(); s.dis();
          s2.show(); s2.Input();
	}

}
