package mt;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyQueue {

	BlockingQueue<Integer> queue;
	boolean hasvalue;
	
	public MyQueue()
	{
		queue = new ArrayBlockingQueue<>(10);
	}
	
	public synchronized void setValue(int value)
	{
		if(hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue.add(value);
		hasvalue =true;
		System.out.println("Set Value : " + value);
		notifyAll();
	}
	
	public synchronized int getValue()
	{
		if(!hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		hasvalue = false;
		notifyAll();
		try {
			return queue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
