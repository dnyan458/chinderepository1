package creat_file;

import java.io.File;
import java.io.IOException;

public class demo
{

	public static void main(String[] args)// throws IOException
	{

		File f = new File("C:\\Users\\Ash\\Desktop\\AC.txt");
		try                                                            //two ways handled

		{
		if(f.createNewFile())
		{
			System.out.println("File sucessfuly created... :");
		}
		else
		{
			System.out.println("File already availble...");
		}
	}
		catch(IOException i)
		{
			System.out.println("Eception handled...!");
			}
		}
}
