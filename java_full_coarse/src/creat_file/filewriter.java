package creat_file;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter
{

	public static void main(String[] args)
	{
		try
		{
			 FileWriter f = new FileWriter("C:\\Users\\Ash\\Desktop\\AC.txt");
			 try
			 {
				 f.write("Name: Janabai Mahdev Chinde ");
				 f.write("Mobile_NO: 8788259558");
				 f.write("city: Latur");
			 }
			 finally
			 {
				f.close();
			 }
			 System.out.println("sucessfully wrote data in file....!");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}

	}

}
