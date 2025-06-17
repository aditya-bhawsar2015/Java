package day9;

public class DemoCounter {

	public static void main(String[] args) {
		Counter c = new Counter();
		Thread one = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (c) {
					for(int i=0; i<50;i++)
					{
						c.increment();
						System.out.println("Thread one Count : " + c.getCount());
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}				
			}
		});
		
		Thread two = new Thread(new Runnable() {			
			@Override
			public void run() {
				synchronized (c) {
					for(int i=0; i<50;i++)
					{
						c.increment();
						System.out.println("Thread two Count : " + c.getCount());
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}					
				}
			}			
		});
		
		one.start();
		two.start();

	}

}
