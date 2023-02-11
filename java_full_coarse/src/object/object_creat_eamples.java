package object;

public class object_creat_eamples
{
	int Age=25;
	int height=32;
	String color="white";

	void eat()
	{
		System.out.println("i am eating");
	}
	void sleep()
	{
		System.out.println("i am sleeping");
	}
	public static void main(String[] args)
	{
   object_creat_eamples r = new object_creat_eamples();
     System.out.println(r.Age);
     System.out.println(r.color);
     System.out.println(r.height);

     r.eat();
     r.sleep();

	}
}
