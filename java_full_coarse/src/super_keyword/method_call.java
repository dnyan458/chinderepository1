package super_keyword;

class v
{
	v(int b)
	//void show()
	{
		System.out.println("Hello Veiwer :"+b);
	}
}                       // when we make one  parameterized and constructor  it shows error
  class h extends v
  {
	  //void show()
	  h()
	  {
		  super(100);
		  //super.show();  /// when constructie we make  deafault constructor and reserve space for super keyword it automatically call super classs method
		  System.out.println("Hello Learner ");
	  }

  }
public class method_call {

	public static void main(String[] args) {
		{
		 h j =new h();
		 //j.show();
		 }
	}

}
