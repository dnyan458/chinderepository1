package New;

public class class2
{
public static void main(String[] args)
{
  // Scanner s = new Scanner(System.in);
	//System.out.println("enter string");

	//String sb =s.next();
	//char a[]= sb.toCharArray();
	String  sb ="madam";
	String r ="";

	for(int i=sb.length()-1;i>=0;i--)
	{
		r =r+sb.charAt(i);
	}
	if(sb.equals(r))
	{
		System.out.println("palindrom string");
	}
	else
	{
		System.out.println("not palindrom String");
	}
	}
}


