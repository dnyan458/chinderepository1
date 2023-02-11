package practice;

public class nested_if_else
{

	public static void main(String[] args)
	{
		int num1=20,num2=10,num3=50;

		if(num1>num2) //20>10
		{

			if(num1>num3) //20>50
			{
				System.out.println("Maimum Number :"+num1);
			}
			else
			{
				System.out.println("Maimum Number :"+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Maimum Number :"+num2);
			}
			else
			{
				System.out.println("Maimum Number :"+num3);
			}
		}

	}

}
