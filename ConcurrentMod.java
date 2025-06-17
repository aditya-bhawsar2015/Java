package mt;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import day9.MyQueue;

public class ConcurrentMod {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i< 10;i++)
				{
					queue.setValue(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10;i++)
				{
					int value =queue.getValue();
					System.out.println("Got Value : " + value);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});

		Executor service = Executors.newFixedThreadPool(4);
		for(int i=0;i<5;i++)
		{
			service.execute(producer);
			service.execute(consumer);
		}

	}

}
