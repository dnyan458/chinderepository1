package Inheritance;
//final class Actorclass
class Actorclass
{
	void act1()
	{
	System.out.println("Acting in drama school");
	}
}
	class moivieclass extends Actorclass
	{
		void act2()
		{
			System.out.println("Acting in movie");
		}
	}
public class final_class
{
	public static void main(String[] args)
	{
		moivieclass s =new moivieclass();
		s.act2();
		s.act1();
	}
}
