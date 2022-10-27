class Deadlock
{
	public static void main(String[] args)
	{
		final String r1 = "hello";
		final String r2 = "hi";
		Thread t1 = new Thread()
				{
					public void run()
					{
						synchronized(r1)
						{
							System.out.println("Thread 1: Resource 1 locked");
							try
							{
								Thread.sleep(100);
							}
							catch(Exception e)
							{
								
							}
							synchronized(r2)
							{
								System.out.println("Thread 1: Resource 2 locked");
							}
						}
					}
				};
				Thread t2 = new Thread()
						{
							public void run()
							{
								synchronized(r2)
								{
									System.out.println("Thread 2: Resource 2 locked");
									try
									{
										Thread.sleep(100);
									}
									catch(Exception e)
									{}
									synchronized(r1)
									{
										System.out.println("Thread 2: Resource 1 locked");
									}
								}
							}
						};
						t1.start();
						t2.start(); 
	}
}