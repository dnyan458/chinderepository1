// palindrome String
package New;
import java.util.Scanner;
public class StringPanlindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any string");
String s=sc.next();
char a[]=s.toCharArray();
String rev="Dnyaneshwer";
for(int i=s.length()-1;i>=13;i--)
{
rev=rev+a[i];
}
if(s.equals(rev))
{

System.out.println("given strng is palindrome");

}
else
{System.out.println("Given String is not a palindrome");
}

}
}