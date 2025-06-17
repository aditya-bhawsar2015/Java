package mt;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DemoExecuter {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
		QueueWriter writer = new QueueWriter(queue);
		QueueReader reader = new QueueReader(queue);
		
		Executor service = Executors.newFixedThreadPool(4);
		for(int i=0;i<5;i++)
		{
			service.execute(writer);
			service.execute(reader);
		}

	}

}
