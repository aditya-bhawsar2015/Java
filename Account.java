package threadAssignment;

public class Account {
	private int balance;
	private int accno;
	
	
	public Account(int balance, int accno) {
		super();
		this.balance = balance;
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "Account [Balance=" + balance + ", accno=" + accno + "]";
	}
	
	public synchronized void deposit(int amount) {
		balance += amount;
		notify();
	}
	public synchronized void withdraw(int amount) 
	{if(this.getBalance() > amount)
	{
		System.out.println(Thread.currentThread().getName() + " is ready to withdraw");
		System.out.println(Thread.currentThread().getName() + " is going to sleep");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "wakes up");
		balance-=amount;
		System.out.println("Available Balance : " + getBalance());
		System.out.println(Thread.currentThread().getName() + "scuucessfully withdrew");
	}
	else
	{
		System.out.println(Thread.currentThread().getName() + " Balance Insufficient waiting for deposit");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
		
	}
	
	public  static void main(String[] args) {
		Account acc = new Account(10000, 1);
		Thread depositor = new Thread(new Runnable() {
			
			@Override
			public void run() {
				acc.deposit(2000);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread withdrawer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				acc.withdraw(3000);
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		});
		withdrawer.start();
		depositor.start();
		
	}
}
