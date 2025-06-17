package day3;

public class Manager extends SalariedEmployee{
	protected double allowance;
	
	public Manager(int empid, String name, double basic, double allowance) {
		super(empid, name, basic);
		this.allowance = allowance;
	}
	
	@Override
	protected double calculateGross() {
		return super.calculateGross() + allowance;
	}

	/*
	 * Co-variant return type
	 */
	@Override
	public Integer getValue()
	{
		return 10000;
	}
	protected void displayAllowance()
	{
		System.out.println("Allowance : " + allowance);
	}
}
