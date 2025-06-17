package day9;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	int count=0;
	//AtomicInteger i = new AtomicInteger(0);
	
	//public synchronized void increment()
	public void increment()
	{
		count++;
		//i.incrementAndGet();
	}
	
	//public synchronized int getCount()
	public int getCount()
	{
		return count;
	}
}
