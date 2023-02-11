package Static;

public class static_keyword
{
 static String name;
 static String city;
 static int postal_code;

	static void accept(String a,String b,int s)
	{
		name=a;
		city=b;
		postal_code=s;
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("city :"+city);
		System.out.println("postal code  :"+postal_code);

	}
	public static void main(String[] args)
	{
		static_keyword g = new static_keyword();
		static_keyword.accept("Dnyaneshwer", "latur", 1495);
		g.display();
	}
}

