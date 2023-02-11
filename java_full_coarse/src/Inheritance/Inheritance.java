package Inheritance;


class Person
{
	String name;
	String city;
	void Accept(String a,String b)
	{
		name=a;
		city=b;
	}
	void dis()
	{
		System.out.println("Name :"+name);
		System.out.println("city :"+city);
	}
}
	class Employee extends Person
	{
		String Company_name;
		void voidinfo(String cc)
		{
			Company_name= cc;

		}
		void dis2()
		{
			System.out.println("Comapny_name :"+Company_name);
		}
	}
		public class Inheritance
		{
		public static void main(String[] args)
		{
			Employee s = new Employee();
			s.Accept("Chinde Dnayneshwer", "HCL");
			s.Company_name="Hcl";
			s.dis();
			s.dis2();
		}
	}
