package day9;

import java.util.concurrent.BlockingQueue;

public class QueueReader implements Runnable {
	BlockingQueue<String> queue;	
	
	public QueueReader(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=0; i<5;i++)
		{
			try {
				String value =queue.take();
				System.out.println(Thread.currentThread().getName() + " got value " + value);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
