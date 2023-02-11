package Inheritance;

class Parent
{
	void dance()
	{
		System.out.println("i am in class 1");
	}
	}
  class child extends Parent
  {
	  @Override
	void dance()
	  {
		  System.out.println("i am in class 2");
	  }
  }

public class Overide
{
 public static void main(String[] args)
 {
	child z = new child();
	z.dance();
   Parent s = new Parent();
	s.dance();

	// overide method run childs class only we use sapretae call class the  parent class run
}
}

