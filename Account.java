package threading;

public class Account {
	
	private int  balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void withdraw(int amount) 
	{
		balance-=amount;
	}
	
}
