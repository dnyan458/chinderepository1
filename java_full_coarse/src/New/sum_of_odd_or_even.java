package New;

import java.util.Scanner;
//Even 10(0+2+4+6+8+10=30)
// odd 11 (1+3+5+7+9+11=39)
public class sum_of_odd_or_even
{
	public static void main(String[] args)
	{
		int n;
		int sum=0;
		{
			System.out.println("Enter range :");
			Scanner r = new Scanner(System.in);
			n =r.nextInt();
			if(n%2==0)
			{
				for(int  i =0;i<=n;i=i+2)
				{
					sum=sum+i;
				}
				System.out.println("sum of evenno :"+sum);
			}
				else
				{
					for(int i=1;i<=n;i=i+2)
					{
						sum=sum+i;
					}
					System.out.println("sum of odd number :"+sum);
				}

			}
		}


	}


