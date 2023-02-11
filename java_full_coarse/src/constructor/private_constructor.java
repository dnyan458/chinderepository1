package constructor;

 class private_constructor
{
	int a;double b;String c;

	 private private_constructor()
	 {
		 a=10;
		 b=20.56;
	     c="ankit";
	     System.out.println(a+" "+b+" "+c+" ");
	 }

  static void show ()
  {
	  int a=12;
	  String f="dnyanehsgwer";
	  System.out.println(a+" "+f+" ");
  }

	public static void main(String[] args)
	{

		  private_constructor s = new private_constructor();
		  private_constructor.show();
	}

}
