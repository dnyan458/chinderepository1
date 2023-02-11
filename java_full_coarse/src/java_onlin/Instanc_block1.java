package java_onlin;

 class Instanc_block1
 {	 int a,b;
	 Instanc_block1()
	{
		  a=30; b=40;
		  System.out.println(a+ " " +b);
	}
	{
	a=10; b=20;
	System.out.println(a+ "." +b);
	}
}
 class B
 {
	 public static void main(String[] args)
	 {
		Instanc_block1 t= new Instanc_block1();
	}
 }