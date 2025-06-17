package day9;

public class DemoThreadMethods {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());		
		t1.setName("One");
		t2.setName("Two");
		
		System.out.println(t1.isAlive()); //Checks if current thread has been started 
		//and has not yet died
		System.out.println(t1.isAlive());
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t1.isAlive());
		
		for(int i=0; i<5;i++)
		{
			System.out.println("Main Thread " + i);
			if(i==2)
			{
				Thread.yield(); //Current thread tells scheduler it is ready to pause
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			t1.join(); //current thread waits till t1 finishes execution
			t2.join();
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println(t1.isAlive());
		

	}

}
