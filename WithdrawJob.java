package day9;

public class WithdrawJob implements Runnable{

	Account a = new Account(10000);
	
	public synchronized void withdraw(int amount)
	{
		if(a.getBalance() > amount)
		{
			System.out.println(Thread.currentThread().getName() + " is ready to withdraw");
			System.out.println(Thread.currentThread().getName() + " is going to sleep");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " wakes up");
			a.withdraw(amount);
			System.out.println("Available Balance : " + a.getBalance());
			System.out.println(Thread.currentThread().getName() + " successfully withdrew");
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + " doesnt have enough money");
		}
		
	}

	@Override
	public void run() {
		for(int i=0; i<3;i++)
		{
			withdraw(2000);
		}
		
	}
	
	
	
}
