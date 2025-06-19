package employee;

import java.util.*;

public class EmployeeCollection {

	public List<Employee> initializeData()
	{
		List<Employee> emplist = new ArrayList<>();
		
		Employee e1 = new Employee(123, "Abc" ,50000, "IT");
		Employee e2 = new Employee(223, "bbc" ,45000, "HR");
		Employee e3 = new Employee(323, "ccc" ,90000, "Admin");
		Employee e4 = new Employee(423, "Abvc" ,70000, "IT");
		Employee e5 = new Employee(523, "Abcd" ,30000, "IT");
		Employee e6 = new Employee(623, "Abce" ,80000, "IT");
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		
		return emplist;
	}
	
	
}
