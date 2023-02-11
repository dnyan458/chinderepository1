package interface1111;

 interface Vehicle
 {
		 String Name="honda"; //public +Static+final
		// int Speed=100;       //

		 void Start();
		 void Stop();
 default void color()
 {
	 System.out.println("tvs colr is red");
 }
 static void speed()
 {
	 System.out.println("speed is 1000;");
 }
 }
 class Customer implements Vehicle
 {

	@Override
	public void Start()
	{
		//Name="TVS";
		System.out.println("Start(): Insert Key And press Start Button :"+Name);
	}

	@Override
	public void Stop()
	{
		System.out.println("Stop(): Exit key");
	}

	 public static void main(String[] args)
	 {
		Customer s = new Customer();
		s.Start();
		s.Stop();
	    s.color();
	    Vehicle.speed();
		//System.out.println(Speed);
	 }
 }
