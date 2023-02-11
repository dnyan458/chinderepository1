package StringBuffer_string_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo
{
public static void main(String[] args) throws IOException
{
	BufferedReader  b = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Name: ");

	String name = b.readLine();
	System.out.println("Name :"+name);
	System.out.println("Enter Mobile_No :");
	int no = Integer.parseInt(b.readLine());
	System.out.println("Mob no :"+no);
 }
}
