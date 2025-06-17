package day9;

import java.util.concurrent.BlockingQueue;

public class QueueWriter implements Runnable {

	BlockingQueue<String> queue;

	public QueueWriter(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=0; i< 5; i++)
		{
			queue.add("Element " +i);
			System.out.println(Thread.currentThread().getName() + " added value Element " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
