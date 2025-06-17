package mt;

public class WithdrawJob implements Runnable {

	Account a = new Account(1324, "aaa", 10000);
	
	public synchronized void withdraw(int amount)
	{
		if(a.getBalance() > amount)
		{
			System.out.println(Thread.currentThread().getName() + " is ready to withdraw");
			System.out.println(Thread.currentThread().getName() + " is sleeping");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " wakes up");
			a.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " successfully withdrew");
			System.out.println("Account balance : "+ a.getBalance());
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + " doesnt have balance");
		}
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++)
		{
			withdraw(2000);
		}
		
	}

	

}
