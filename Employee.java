package day3;

abstract public class Employee {
	protected int empid;
	protected String name;
	
	protected static int pt = 200;
	
	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}
	
	abstract double calculateGross();

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
	
}
