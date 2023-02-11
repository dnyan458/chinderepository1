package constructor;

 class parametrized
{
     int v;
     String h;
	parametrized(int a,String b)
	{
		v=a;
		h=b;
	}
	void show()
	{
		System.out.println(v+" "+h);
	}


	public static void main(String[] args)
	{
      parametrized s = new  parametrized(23,"Dnyaneshwer");
      s.show();
	}

}
