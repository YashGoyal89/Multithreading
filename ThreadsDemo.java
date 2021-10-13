package DemoPrograms;
//To create and demonstrate a user defined thread object
public class ThreadsDemo extends Thread{
	
	//Overriding run() --> State 3: Running
	public void run()
	{
		for(int i=0 ; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+"Thread executing" + i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Thread Terminating....");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//State 1: Thread Creation (New)
		ThreadsDemo t1 = new ThreadsDemo();
		ThreadsDemo t2 = new ThreadsDemo();
		ThreadsDemo t3 = new ThreadsDemo();
		ThreadsDemo t4 = new ThreadsDemo();
		
		t1.setName("Harry");
		t2.setName("John");
		t3.setName("Rahul");
		t4.setName("Harold");
		
		System.out.println("Name of Thread t1 is: "+t1.getName());
		System.out.println("Name of Thread t2 is: "+t2.getName());
		System.out.println("Name of Thread t3 is: "+t3.getName());
		System.out.println("Name of Thread t4 is: "+t4.getName());
		
		//State 2: Runnable/Ready --> Make Thread runnable
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"Thread Executing "+i);
			Thread.sleep(1000);
		}
		
		System.out.println(Thread.currentThread().getName()+"Thread terminating...");
	}

}
