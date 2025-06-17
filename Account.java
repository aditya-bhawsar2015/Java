package mt;

public class Account {

	int accid;
	String name;
	int balance;
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(int accid, String name, int balance) {
		super();
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	
	public void withdraw(int amount)
	{
		balance = balance-amount;
	}
	
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
