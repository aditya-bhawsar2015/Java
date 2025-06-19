package lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class DemoIntegerStream {

	public static void main(String[] args) {
		Integer [] arr= {7,10,23,13,17,26,2,15,24,21,4,7,10,23,18,22};
		Stream<Integer> stream= Arrays.stream(arr);
		
		List<Integer> list = Arrays.asList(arr);
		stream = list.stream();
		
	System.out.println("======== FIND UNIQUE ELEMENT COUNT==============");
	long unique = stream.distinct().count();
	System.out.println(unique);
	
	System.out.println("===================SORTING========================");
	stream = list.stream();
	List<Integer> sorted= stream.distinct().sorted().collect(Collectors.toList());
	System.out.println(sorted);
	
	System.out.println("=================MAPPING=====================");
	stream = list.stream();
	stream.distinct().map((n) ->Math.sqrt(n)).forEach(System.out::println);
	
	System.out.println("================FILTER=======================");
	stream = list.stream();
	Set<Integer> evens=stream.filter((n)-> n%2==0).collect(Collectors.toSet());
	System.out.println(evens);
	
	System.out.println("==============REDUCE=====================");
	stream = list.stream();
	Optional<Integer> total= stream.reduce((n1,n2) -> n1+n2);
	if(total.isPresent())
		System.out.println(total.get());
	
	System.out.println("==============MIN/MAX/AVERAGE====================");
	stream=list.stream();
	Optional<Integer> min = stream.min(Integer::compareTo);
	if(min.isPresent())
		System.out.println(min.get());
	
	stream=list.stream();
	Optional<Integer> max = stream.max(Integer::compareTo);
	if(max.isPresent())
		System.out.println(max.get());
	
	stream = list.stream();
	OptionalDouble ave= stream.distinct().mapToDouble(Double::valueOf).average();
	if(ave.isPresent())
		System.out.println(ave.getAsDouble());	
	
	
	}

}
