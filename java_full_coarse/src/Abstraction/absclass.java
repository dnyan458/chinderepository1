package Abstraction;

 abstract class Animal
{
	void legs()
	{
		System.out.println("All Animals have 4 legs ");
	}
   abstract void sound();
   abstract void eat();
	}
   class Dog extends Animal
   {

	@Override
	void sound()
	{
		System.out.println("Bow Bow...");
	}

	@Override
	void eat()
	{
		System.out.println("Meat Eating..");
	}

   }
   class Cow extends Animal
   {

	@Override
	void sound()
	{

		System.out.println("ooo ooo...");
	}

	@Override
	void eat()
	{
		System.out.println("Grass Eating..");
	}

   }
public class absclass
{
	public static void main(String[] args)
	{

		Dog e = new Dog();
		Cow r = new Cow();
		e.sound(); e.eat(); e.legs();
		r.sound(); r.eat(); r.legs();
	}
}
