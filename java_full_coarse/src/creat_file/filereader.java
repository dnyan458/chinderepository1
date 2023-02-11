package creat_file;

import java.io.FileReader;
import java.io.IOException;

public class filereader
{

	public static void main(String[] args)
	{
		try
		{
			FileReader f = new FileReader("C:\\Users\\Ash\\Desktop\\AC.txt");

			try
			{
				int i;
				while((i=f.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				f.close();
			}

		}
		catch(IOException e)
		{
			System.out.println("Eception handled....!");
		}

	}

}
