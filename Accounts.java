package day3;

public class Accounts {
	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		Employee [] emp = new Employee[3];
		emp[0] = new SalariedEmployee(22, "Akshat", 250000.00);//upcasting
		emp[1] = new Manager(23, "Saksham", 2399999.00, 12345);
		emp[2] = new ContractEmployee(24, "somemone", 55, 1200);
		
		for(Employee e : emp) {
			payroll.displayGross(e);
		}
		
		for(Employee e : emp) {
			if(e instanceof SalariedEmployee) {
				//DownCastings
				//((SalariedEmployee) e).calculateNet();
				SalariedEmployee s = (SalariedEmployee) e;
				payroll.displayNet(s);
			}
		}
	}

}
