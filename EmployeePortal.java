package day6;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class EmployeePortal {

	public static void main(String[] args) {
		EmployeeCollection collection = new EmployeeCollection();
		List<Employee> emplist = collection.initializeData();
		collection.printData(emplist);
		
		System.out.println("---- Filter by Skill------------");
		List<Employee> filtered = collection.filerBySkill(emplist, "C++");
		collection.printData(filtered);
		
		System.out.println("------------Salary Map--------------");
		Map<String, Double> salmap= collection.salaryMap(emplist);
		System.out.println(salmap);
		
		System.out.println("---------Sorting by EmpId------------");
		Collections.sort(emplist);
		collection.printData(emplist);
		int found =Collections.binarySearch(emplist, new Employee(445, null, 0, null));
		System.out.println("Found at :"+ found);
		
		System.out.println("---------Sorting by Name ------------");
		Collections.sort(emplist, new NameComparator());
		collection.printData(emplist);
		found = Collections.binarySearch(emplist, new Employee(0, "sss", 0, null), 
				new NameComparator());
		System.out.println("Found at :"+ found);
		
		System.out.println("---------Sorting by Salary ------------");
		Collections.sort(emplist, new SalaryComparator());
		collection.printData(emplist);
		
		System.out.println("------------min/max salary--------------");
		Employee minsal =Collections.min(emplist, new SalaryComparator());
		System.out.println(minsal);
		
		Employee maxsal =Collections.max(emplist, new SalaryComparator());
		System.out.println(maxsal);
	}

}
