package assignments;

public class Account {

	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public synchronized void withdraw(int amount)
	{
		if(balance < amount)
		{
			System.out.println("Balance Insuffucient ..Waiting for Deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance-= amount;
		System.out.println("Withdraw successful");
		System.out.println("Balance :" + balance);
	}
	
	public synchronized void deposit(int amount)
	{
		balance +=amount;
		notify();
		System.out.println("Deposit successful");
		System.out.println("Balance :" + balance);
		
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
}
