package demoStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoIntStream {
	public static void main(String[] args) {
		
		int arr[] = IntStream.range(10, 30).toArray();
		System.out.println(arr);
		
		IntStream stream = Arrays.stream(arr);
		System.out.println("---------------Stream to Collection---------------");
		stream = Arrays.stream(arr);
		List<Integer> list = stream.map((n) ->n/2).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("-----------------Stream to string----------------");
		stream = Arrays.stream(arr);
		String data = stream.filter((n) -> n>20).mapToObj(String :: valueOf).collect(Collectors.joining(","));
		System.out.println(data);
				
		
		System.out.println("---------------");
		stream = Arrays.stream(arr);
		stream.parallel().forEachOrdered((n)-> System.out.print(n*2 + ", "));
		
		System.out.println("\n---------------");
		stream = Arrays.stream(arr);
		int total = stream.parallel().reduce(0, (n1,n2)-> n1+n2);
		System.out.println(total);
		
		stream = Arrays.stream(arr);
		total = stream.sum();
		System.out.println(total);
		
		System.out.println("----------------------");
		stream =Arrays.stream(arr);
		OptionalInt min = stream.min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		
		System.out.println("-------------------");
		stream = Arrays.stream(arr);
		OptionalInt max = stream.max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		
		System.out.println("---------------------------");
		stream = Arrays.stream(arr);
		OptionalDouble ave = stream.average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
	
		
		System.out.println("------------Filter vs Dropwhile------------------");
		stream = Arrays.stream(arr);
		List<Integer> filtered = stream.filter((n) ->  n<20).boxed().collect(Collectors.toList());
		System.out.println(filtered);
		
		stream = Arrays.stream(arr);
		List<Integer> dropped = stream.dropWhile((n) -> n<20).boxed().collect(Collectors.toList());
		System.out.println(dropped);
	
		System.out.println("-------------------");
		stream = Arrays.stream(arr);
		boolean matched = stream.anyMatch((n)-> n>20);
		System.out.println(matched);
	
		System.out.println("---------------------");
		stream = Arrays.stream(arr);
		matched = stream.allMatch((n) -> n>20);
		System.out.println(matched);
	
		 System.out.println("------------Flat Map------------");
		 List<List<Integer>> tdlist = new ArrayList<>();
		 tdlist.add(Arrays.asList(1,2));
		 tdlist.add(Arrays.asList(3,4));
		 tdlist.add(Arrays.asList(5,6));
		 tdlist.add(Arrays.asList(7,8));
	
		 System.out.println(tdlist);
		 Stream<Integer> istream = tdlist.stream().flatMap((lst) -> lst.stream());
		 List<Integer> flat = istream.collect(Collectors.toList());
		 System.out.println(flat);	
	}		
 }
