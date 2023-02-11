package Inheritance;

public class this_key1
{
    void m1()
    {
    	System.out.println("i am in class first");
    }
    void m2()
    {
    	this.m1();
    	System.out.println("i am in class second");
    }
	public static void main(String[] args)
	{
		  this_key1 s = new this_key1();
		  s.m2();
	}
}
