package demoStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class DemoClassCompr {

	public static void main(String[] args) {
		
		String [] greetings = {"Hii", "Hello", "Good Morning"};
		
		Stream <String> stream = Arrays.stream(greetings);
		
		Optional<String> largest = stream.max(Comparator.comparing(String::length));
		largest.ifPresent(System.out::println);
		
		stream = Arrays.stream(greetings);
		Optional<String> longest = stream.reduce((s1,s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
			
		});
		stream = Arrays.stream(greetings);
		stream.reduce((s1,s2) -> s1.length() >s2.length() ? s1 :s2);
		longest.ifPresent(System.out::println);
	}

}
