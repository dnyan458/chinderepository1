package java_onlin;

 class Static_varables
{
  static int a=10;  //11 cange value callng again again change same memeory not changed increment value

  void fun()
  {
	  int b= 10; // distroy memory and new memory   fix value
	  System.out.println(a+ " " +b);

	  ++a; ++b;  //11
  }
  public static void main(String[] args)
  {
	  Static_varables r = new Static_varables();
	  r.fun();
	  r.fun();
	  r.fun();

}
}
