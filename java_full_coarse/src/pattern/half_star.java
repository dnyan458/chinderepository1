package pattern;

public class half_star
{
	public static void main(String[] args)
	{/*
		 * int i,j;
		 *
		 * for(i=1;i<=5;i++) //rows
		 *
		 * {
		 * for(j=1;j<=i;j++)//column
		 *
		 * {
		 * System.out.print("*");
		 *
		 * }
		 * System.out.print("\n"); }
		 *
		 */


		/*
		 * int m,n,o;
		 *
		 * for(m=1;m<=5;m++) //rows
		 *  {
		 *  for(n=m;n<5;n++)//space
		 *  {
		 *  System.out.print(" ");
		 * }
		 * for(o=1;o<=m;o++)//column
		 *  {
		 *   System.out.print("*");
		 *
		 * }
		 * System.out.print("\n"); }
		 *
		 *
		 *
		 */

		int a,b,c;
		for(a=1;a<=5;a++)
		{
			for(b=1;b<a;b++)
			{
			System.out.print(" ");
			}
			for(c=a;c<=5;c++)//column
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
