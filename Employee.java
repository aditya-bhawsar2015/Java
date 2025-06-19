package employee;

public class Employee {
	int empid;
	String name;
	int salary;
	String department;
	public Employee(int empid, String name, int salary, String department) {
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
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
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
	
}
