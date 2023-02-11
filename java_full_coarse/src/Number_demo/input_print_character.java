package Number_demo;

import java.util.Scanner;

public class input_print_character
{
public static void main(String[] args)
{
	 char n;
     System.out.println("please enter charcater ");
     Scanner s = new Scanner(System.in);
     n = s.next().charAt(2);
     System.out.print(n);

	 int w,u;

     System.out.println("please enter number ");
     Scanner e = new Scanner(System.in);
     w=e.nextInt();
     u=e.nextInt();
     System.out.print(w+" " +u);



}
}
