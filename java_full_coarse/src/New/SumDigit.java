package New;

public class SumDigit
{
public static void main(String args[])
{
int num=12345,sum=0;

while(num>0)
{
sum=sum+num%10;

num=num/10;

}
System.out.print("sum of digit = "+sum);

}
}