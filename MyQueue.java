package threading;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueue {
	Queue<Integer> 	queue;
	boolean hasvalue;
	
	public MyQueue()
	{
		queue = new ArrayBlockingQueue<>(1);
	}
	
	public synchronized void setValue(int value)
	{
		if(hasvalue) {
			try {
				wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			queue.add(value);
			hasvalue = true;
			System.out.println("Set value : " + value);
			notify();
		}
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
		hasvalue=false;
		notify();
		return queue.poll();
	}
}
