package Inheritance;

class Animal
{
	String colour="White";
}
class Dog extends Animal
{
	String colour="Black";
	void dis()
	{
		System.out.println("Dog color :"+colour);
		System.out.println("Animal color :"+super.colour);
		//System.out.println("Animal color :"+colour);
	}
}

public class super_keyword
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.dis();

		}

}
