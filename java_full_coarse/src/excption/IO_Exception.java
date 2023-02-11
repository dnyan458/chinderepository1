package excption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Exception
{
	 String str;

	void acc()
	{
	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Ent");
	 try
	 {
		String str = b.readLine();
	}
	 catch (IOException e)
	 {
		System.out.println(str);
		e.printStackTrace();
	}
	}
	public static void main(String[] args)
	{
		IO_Exception  i = new IO_Exception();
		i.acc();
	}
}