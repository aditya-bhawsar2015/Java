package day3;

public class Payroll {
	
	public void displayGross(Employee e)
	{
		System.out.println("Gross salary for the month : " + e.calculateGross());
	}
	public void displayNet( SalariedEmployee se)
	{
		System.out.println("Net salary for the month : " + se.calculateNet());
	}
	
	public static void main(String[] args) {
		Payroll payroll= new Payroll();
		
		Manager me = new Manager(1000, "BBBB", 200000.00, 5000000.00);
		SalariedEmployee se = new SalariedEmployee(1111, "AAAA", 30000.00);
		ContractEmployee ce = new ContractEmployee(222, "ABCD" , 60, 500);
		
		System.out.println(me);
		payroll.displayGross(me);
		
		System.out.println(se);
		payroll.displayGross(se);
		
		System.out.println(ce);
		payroll.displayGross(ce);
	}
	
}
