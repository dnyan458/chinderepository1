package Static;

public class statics
{
	 statics()
	 {
		 System.out.println("i am in contructor");
	 }
	{
	System.out.println("i am in block 1");
	}
	{
		System.out.println("i am in block 2");
	}
	 static
	{

		System.out.println("i am in static block");
	}
	public static void main(String[] args)
	{
		statics g =new statics();

	}

}


// alwasy static block execute first