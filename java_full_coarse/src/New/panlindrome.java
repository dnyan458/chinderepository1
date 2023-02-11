//palandrome number
package New;
public class panlindrome
{
public static void main(String args[])
{
int num=12421,rev=0;
int Originalnum=num;
while(num!=0)
{
rev=rev*10+num%10;
num=num/10;
}
if(rev==Originalnum)
{
System.out.println("GIven number :"+Originalnum+"-->  is palindrome");
}else{
System.out.println("GIven number"+Originalnum+" is not a palindrome");}

}}