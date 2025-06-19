package day3;

public class ContractEmployee extends Employee {
	protected double hrs;
	protected double rate;
	
	public ContractEmployee(int empid, String name, double hrs, double rate) {
		super(empid, name);
		this.hrs = hrs;
		this.rate = rate;
	}
	
	protected double calculateGross() {
		return hrs * rate;
	}
}
