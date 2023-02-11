package constructor;

 class defaults_contructor
{
	int a; String b; boolean c;

	 defaults_contructor()
	{
		a=1040;
		b="Dnyaneshwer";
		c=false;
	}
	void show()
	{
		System.out.println(a+" "+b+" "+c+" ");
	}


	public static void main(String[] args)
	{
      defaults_contructor refss = new defaults_contructor();
      refss.show();
	}
	}
