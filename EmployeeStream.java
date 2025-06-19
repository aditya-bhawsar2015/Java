package employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
	public static void main(String[] args) {
		
		EmployeeCollection collection =  new EmployeeCollection();
		List<Employee> emplist = collection.initializeData();
		
		System.out.println("----------- Sorting by Name------------");
		Stream<Employee> stream = emplist.stream();
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		stream.sorted(byname).forEach(System.out::println);
		
		
		System.out.println("--------------Department wise sorted list------------");
		stream=emplist.stream();
		Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
		stream.sorted(bydept).forEach(System.out::println);
		
		System.out.println("---------Employee - Department Mapping------------");
		stream= emplist.stream();
		stream.map((emp) -> new Department(emp.getEmpid(),emp.getDepartment())).forEach(System.out::println);
		
		System.out.println("------------Grouping by Department--------------");
		stream = emplist.stream();
		stream.collect(Collectors.groupingBy(Employee::getDepartment))
		.forEach((k,v) -> System.out.println(k +"-" + v));
		
		System.out.println("-------------Filter by Department----------------");
		stream= emplist.stream();
		stream.filter((emp) ->emp.getSalary()>60000).forEach(System.out::println);
		
		System.out.println("------------min/max/average---------------");
		stream = emplist.stream();
		Optional<Employee> withmin = stream.min(Comparator.comparing(Employee::getSalary));
		withmin.ifPresent(System.out::println);
		
		stream = emplist.stream();
		Optional<Employee> withmax = stream.max(Comparator.comparing(Employee::getSalary));
		withmax.ifPresent(System.out::println);
		
		stream = emplist.stream();
		OptionalDouble avesal = stream.mapToDouble(Employee::getSalary).average();
		System.out.println(avesal.getAsDouble());
		
		
	}
}
