package day4;

public class SavingsAccount extends Account{

	protected static float intrate = 6.5f;
	
	public SavingsAccount(int accid, String name, double balance, Address address) {
		super(accid, name, balance, address);
	}
	
	public void calculateInterest()
	{
		double interest = (balance * intrate*0.25)/100;
		System.out.println("Interest earned : " + interest);
	}

}
