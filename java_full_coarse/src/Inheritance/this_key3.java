package Inheritance;

  public class this_key3
{
    this_key3()
   {
	   System.out.println("i am in constructor");
   }
   this_key3(int x)
   {
	   this();
	   System.out.println("i am in x:"+x);
   }
   this_key3(int x,int y)
   {
	   this(x);
	   System.out.println("i am in y:"+y);
   }
   public static void main(String[] args)
   {
	   this_key3  s = new this_key3(23,22);


}
}
