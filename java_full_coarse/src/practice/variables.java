package practice;

public class variables
{

	int a =10;   //instance variable
	 static double b =12.5; // static variable
	public static void main(String[] args)
	{
        boolean c =true; //local variable

        variables s = new variables();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(s.a+" "+b+" "+c+" ");

	}

}
