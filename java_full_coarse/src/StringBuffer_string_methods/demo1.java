package StringBuffer_string_methods;

public class demo1
{

	public static void main(String[] args)
	{
    String str ="Dnyaneshwer";
    String str2 ="chinde";
    String str3 ="asdffff";
    String str4 ="csaasas";
    String str5 ="Dnyaneshwer";

    System.out.println(str==str5);


    String str6 = new String("Dnyaneshwer");
    System.out.println(str6==str5);
    System.out.println(str.equals(str6));
	}

}
