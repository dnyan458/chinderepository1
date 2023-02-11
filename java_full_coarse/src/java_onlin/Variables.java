package java_onlin;

public class Variables
{
	static int b=20; //static variable //no need object for calling // it access classname .  varable name
	int c=30;  //Intance variable // need object calling

	public static void main(String[] args)
	{
		Variables ref = new Variables();
      int a=10;  //local variable
      System.out.println(a);
      System.out.println(Variables.b);
      System.out.println(ref.c);
	}

}

/*
 *  Q. How many types of  java variables
 *
 *  Ans.  1. Loacal variable: "A variable which is used
 *                             declared inside the body of class  method or method parameter.
 *
 *        2. Static variable :"A variable which is declared with help of
 *                             static keyword is called "static keyword".
 *
 *        3. Instance variable :"A variable which is declared inside the class but outside
 *                               the all methods is called "instance varaible".
 */
