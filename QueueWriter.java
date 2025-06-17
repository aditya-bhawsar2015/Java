package mt;

import java.util.concurrent.BlockingQueue;

public class QueueWriter implements Runnable{

	BlockingQueue<String> queue;
	
	public QueueWriter(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}
	@Override
	public void run() {
		for(int i=0; i<5;i++)
		{
			String value = "Elelment" + i;
			queue.add(value);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " added value : "+ value);
		}
		
	}
}
