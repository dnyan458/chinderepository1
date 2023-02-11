// reveres number
package New;
public class revdigit{


public static void main(String args[]){

int num=123456;
int rev=0,sum=0;

while(num!=0){


rev=rev*10+num%10;
sum=sum+num%10;
num=num/10;
}
System.out.println("reveres number = "+rev);
System.out.println("sum of number = "+sum);

int p=12345;
String s=String.valueOf(p);
StringBuilder sb=new StringBuilder(s);
System.out.println("reverse number = "+sb.reverse());

 }
}