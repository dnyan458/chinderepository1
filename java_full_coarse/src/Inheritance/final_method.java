package Inheritance;

	class Actor
	{
		 //final void act()
		void act1()
		{
		System.out.println("Acting in drama school");
		}
	}
		class moivie extends Actor
		{
			void act()
			{
				System.out.println("Acting in movie");
			}
		}
	public class  final_method
	{
		public static void main(String[] args)
		{
			moivie s =new moivie();
			s.act();
		}
	}

