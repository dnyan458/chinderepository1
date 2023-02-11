package java_onlin;

public class Instance_block
{
	public Instance_block() // constructor execute after instance blocks
	{
		System.out.println("Default constructor");
	}
	{//instance without object instance block not run
		System.out.println("Learn coding");
	}
	public static void main(String[] args)
	{
		Instance_block s = new Instance_block();

	}
}

/*   Instance block : insatnce block has no name ,it can be written  inside class
 *                    but not inside method.
 *
 *         Note : 1]It always execute before the constructor.
 *                2]We can use variable only inside the instance block not method
 *                3]At write  time consuming code inside a instance block like -JDBC
 *                   connectivity.
 *
*/
