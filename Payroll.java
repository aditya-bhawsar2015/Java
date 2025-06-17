package day3;

public class Payroll {

	public void displayGross(Employee e)
	{
		System.out.println("Gross Salary for the Month : " + e.calculateGross());
	}
	
	public void displayNet(SalariedEmployee se)
	{
		System.out.println("Net Salary for the Month : " + se.calculateNet());
	}
	
	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		SalariedEmployee se = new SalariedEmployee(2334, "ppp", 600000);
		Manager me = new Manager(56475, "mmm", 80000, 15000);
		ContractEmployee ce = new ContractEmployee(342, "sss", 40, 500);
		
		System.out.println(se);
		payroll.displayGross(se);
		
		System.out.println(me);
		payroll.displayGross(me);
		
		System.out.println(ce);
		payroll.displayGross(ce);
		
		Employee newemp= se.getObject();
		
	}
}
