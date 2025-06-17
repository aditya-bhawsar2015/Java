package day9;

public class DemoConcurrency {

	public static void main(String[] args) {
		WithdrawJob job = new WithdrawJob();
		
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		
		t1.setName("Holder1");
		t2.setName("Holder2");
		
		t1.start();
		t2.start();

	}

}
