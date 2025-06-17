package day8;

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
		//Using range we get a stream
		//Stream to arr -> toArray()
		int [] arr = IntStream.range(10, 30).toArray();
		System.out.println(Arrays.toString(arr));
		
		//Array to stream
		IntStream stream = Arrays.stream(arr);
		stream.limit(10).forEach(System.out::println);
		
		System.out.println("------Stream to Collection-----");
		stream = Arrays.stream(arr);
		List<Integer> list= stream.map((n) -> n/2).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("------Stream to String-----");
		stream = Arrays.stream(arr);
		String data= stream.filter((n) -> n>20).mapToObj(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(data);
		
		System.out.println("------forEach vs forEachOrdered------");
		stream = Arrays.stream(arr);
		stream.parallel().forEach((n) -> System.out.println(n*2));
		
		System.out.println("-----------------");
		stream = Arrays.stream(arr);
		stream.parallel().forEachOrdered((n) -> System.out.println(n*2));

		System.out.println("-----------------");
		stream = Arrays.stream(arr);
		int total =stream.parallel().reduce(0, (n1,n2)-> n1+n2);
		System.out.println(total);
		
		stream = Arrays.stream(arr);
		total =stream.sum();
		System.out.println(total);
		
		System.out.println("-----------------");
		stream = Arrays.stream(arr);
		OptionalInt min= stream.min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		
		System.out.println("-----------------");
		stream = Arrays.stream(arr);
		OptionalInt max= stream.max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		
		System.out.println("-----------------");
		stream = Arrays.stream(arr);
		OptionalDouble ave=  stream.average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
		
		/*
		 * filter decides which elements to keep by given predicate
		 * dropWhile decides which elements to remove by given predicate
		 * Once the first element not matching the given predicate is found 
		 * dropWhile stops discarding the elements (in an ordered Stream)
		 */
		System.out.println("----------filter vs dropWhile-------------");
		stream = Arrays.stream(arr);
		List<Integer> filtered = stream.filter((n) -> n<20).boxed().collect(Collectors.toList());
		System.out.println(filtered);

		stream = Arrays.stream(arr);
		List<Integer> dropped =stream.dropWhile((n) -> n< 20).boxed().collect(Collectors.toList());
		System.out.println(dropped);
		
		System.out.println("-------------");
		stream = Arrays.stream(arr);
		boolean matched= stream.anyMatch((n) -> n<20);
		System.out.println(matched);
		
		stream = Arrays.stream(arr);
		matched= stream.allMatch((n) -> n<20);
		System.out.println(matched);
		
		System.out.println("----------Flat map----------");
		List<List<Integer>> tdlist = new ArrayList<>();
		tdlist.add(Arrays.asList(1,2));
		tdlist.add(Arrays.asList(3,4));
		tdlist.add(Arrays.asList(5,6));
		tdlist.add(Arrays.asList(7,8));
		
		System.out.println(tdlist);
		Stream<Integer> istream = tdlist.stream().flatMap((lst) -> lst.stream());
		List<Integer> flat= istream.collect(Collectors.toList());
		System.out.println(flat);
		
		
	}

}
