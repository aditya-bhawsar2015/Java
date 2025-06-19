package day3;

public class SalariedEmployee extends Employee {
	protected double basic;
	
//	public SalariedEmployee(int empid, String name, double basic) {
//		this.empid=empid;
//		this.name=name;
//		this.basic=basic;
//	}
//	The above gives error as empid and name is inherited from Employee class
	
	public SalariedEmployee(int empid, String name, double basic) {
		super(empid, name);
		this.basic=basic;
	}
@Override	
protected double calculateGross() {
	double hra = 0.4*basic;
	double da = 0.15*basic;
	
	return basic + hra+ da;
}

protected double calculateNet() {
	double pf = 0.12*basic;
	
	return calculateGross() -pf;
}
@Override
public String toString() {
	return super.toString() + "Gross Salary" + this.calculateGross() + "and Net : " + this.calculateNet() ;
}


	
}
