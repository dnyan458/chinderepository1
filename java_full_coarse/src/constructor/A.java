package constructor;

public class A
{
	int a;
	String Name;

	A()
	{
		a=23;
		Name="Dnyaneshwer";
	}
	void Show()
	{
		System.out.println(a+" "+Name);
	}

	public static void main(String[] args)
	{
              A resf =new A();
              resf.Show();

}
}