package thread;

public class Thread1 extends Thread {
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
}
