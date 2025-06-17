package day3;

public class ContractEmployee extends Employee{
	protected int hrs;
	protected int rate;
	public ContractEmployee(int empid, String name, int hrs, int rate) {
		super(empid, name);
		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	protected double calculateGross() {
		return rate * hrs;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", Gross=" + this.calculateGross() ;
	}

	@Override
	protected Employee getObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
