package day6;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
//		if(o1.getSalary() < o2.getSalary())
//			return -1;
//		else if(o1.getSalary() > o2.getSalary())
//			return 1;
//		else
//			return 0;
	}

}
