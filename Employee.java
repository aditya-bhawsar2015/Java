package day8;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private String department;
	public Employee(int empid, String name, double salary, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "empid=" + empid + ", name=" + name + ", salary=" + salary + ", department=" + department;
	}
	
	
}
