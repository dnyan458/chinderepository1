package polymorphism_overloading_overiding;

class A
{
	void draw()
	{
		System.out.println("cant say shape");
	}
}
     class B extends A
     {
    	 @Override
    	 void draw()
    	 {
    		 super.draw();
    		 System.out.println("cant say Size");
    	 }
     }
public class overrideng
{
	public static void main(String[] args)
	{
     A s = new B();
     s.draw();
	}

}
