package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeCollection {

	public List<Employee> initializeData()
	{
		List<Employee> emplist = new ArrayList<>();
		
		Employee e1 = new Employee(445, "ppp", 80000, "IT");		
		Employee e2 = new Employee(123, "sss", 70000, "Admin");		
		Employee e3 = new Employee(523, "aaa", 60000, "HR");			
		Employee e4 = new Employee(323, "rrr", 50000, "IT");		
		Employee e5 = new Employee(523, "bbb", 65000, "HR");		
		Employee e6 = new Employee(123, "mmm", 40000, "Admin");
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		
		return emplist;
	}
}
