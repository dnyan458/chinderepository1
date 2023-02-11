package excption;

public class ArrayIndexout_of_bond_index
{
public static void main(String[] args)
{
try
{
	//int a[]= {11,22,33,44,55};
	int a[]= new int[5];
	a[10]=50;  //
	System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException e)
 {
	System.out.println("Exception cought :"+e);
  }
 }
}
