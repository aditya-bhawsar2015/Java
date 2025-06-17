package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		String [] greeetings = {"hi", "hello", "good morning"};
		
		Stream<String> stream = Arrays.stream(greeetings);
		
		Optional<String> largest =stream.max(Comparator.comparing(String::length));
		largest.ifPresent(System.out::println);
		
		stream = Arrays.stream(greeetings);
		Optional<String> longest= stream.reduce((s1,s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		});
		stream.reduce((s1,s2) -> s1.length() > s2.length() ? s1 :s2);
		longest.ifPresent(System.out::println);
	}

}
