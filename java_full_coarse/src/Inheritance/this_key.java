package Inheritance;

public class this_key
{
	String name;
	String city;
	int id;

	void accept(String name,String city,int id)
	{
		this.name =name;
		this.city=city;
		this.id=id;

	}
	void dis()
	{
		System.out.println(name);
		System.out.println(city);
		System.out.println(id);
	}
	public static void main(String[] args)
	{
		this_key d =new this_key();
		d.city="Latur";
		d.name="Dnyaneshwer";
		d.id=21;
		d.dis();
	}

}
