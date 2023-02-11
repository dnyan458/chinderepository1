package excption;

  class exxxception  extends  Exception
  {
	  exxxception(String str)
	  {
		  super(str);
	  }
  }
	  public class  Custom_Exception
	  {
			 public static void main(String[] args)
			 {
				 int age =3;

			try
			{
				if(age>18)
				{
					throw new exxxception("Eligible for voting......");
				}
				else
				{
					throw  new exxxception("not Eligible for voting");
				}
			}
		 catch(exxxception e)
			{
			 System.out.println(e);
			}
	 }

	  }
