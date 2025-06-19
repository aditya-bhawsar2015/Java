package thread;

public class DemoThread {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());
		Thread t3 = new Thread(new Thread2());
		Thread t4 = new Thread(new Runnable() 
		
		{
			@Override
			public void run() {
				
					for(int i = 0; i<=5; i++) {
						System.out.println(Thread.currentThread().getName()+" "+i);
						try {
							Thread.sleep(2000);
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				
			}
			
		});
		t4.start();
		
		Runnable r = () ->
		{
			for(int i = 0; i<=5; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(2000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread t5 = new Thread(r);
		t5.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread "+ i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
