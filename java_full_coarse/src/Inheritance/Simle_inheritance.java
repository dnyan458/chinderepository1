package Inheritance;

class Student
{
	//protected
	int Roll,Marks; // we can use protected inheritance
	String Name;
	//protected
	void Input()
	{
		System.out.println("Enter Roll and Marks: ");
	}
}
class Ankit extends Student
{
	void Display()
	{
		Roll=1;
		Marks=77;
		Name="Dnyaneshwer";
		System.out.println(Roll+" "+Marks+" "+Name);
	}

}
public class Simle_inheritance
{
	public static void main(String[] args)
	{
        Ankit a = new Ankit();
        a.Input();
        a.Display();

	}
}

