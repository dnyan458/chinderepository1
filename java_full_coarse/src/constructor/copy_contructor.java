
package constructor;

public class copy_contructor
{
	int a;
	String b;

	 copy_contructor()
	 {
		 a=10;
		 b="dnyaneshwer";
		 System.out.println(a+" "+b);
	}
	 copy_contructor(copy_contructor ref)
	 {
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	 }

	public static void main(String[] args)
	{
        copy_contructor s =new copy_contructor();
        copy_contructor s2 =new copy_contructor(s);

	}

}
