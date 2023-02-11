package multiThreading;

class A implements Runnable
{

	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("MY CHILD THREAD");
		}

		}

	}
public class by_impement_runnable_interface
{

	public static void main(String[] args)
	{
           A r = new  A();

           Thread s = new Thread(r);
           s.start();
           for(int i=1;i<=5;i++)
   		{
   			System.out.println("my MAIN THREAD");
   		}
	}

}
