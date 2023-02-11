package array;
 class instance_vs_static_block
 {
	 int a=10; static int  b=20;
	  instance_vs_static_block()
	 {
		 System.out.println("default constructor");
	 }
	  {	 //instance block

		  // instance block run both static and non-static varibles
		 // instace bloc run  first  and default constructer then
	     //instance block without object doesnt calll so make object first

	   System.out.println("leran coding");
	   System.out.println(a+" "+b+" ");
    }

	public static void main(String[] args)
	{
     instance_vs_static_block s =new instance_vs_static_block();// so make object first for instance block
}
}