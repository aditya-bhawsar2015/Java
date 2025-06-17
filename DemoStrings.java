package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStrings {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String n1 = new String("Java");
		String n2 = new String("Java");
		System.out.println(n1.hashCode());
		System.out.println(n1.hashCode());
		
		if(s1==s2)
			System.out.println("Strings are equal");
		
		//if(n1==n2)
		if(n1.equals(n2))
			System.out.println("String objects are equal");
	
		List<String> colors = new ArrayList<>();
		colors.add("Black");
		colors.add("White");

		String c= String.join(",", colors);
		System.out.println(c);
		
		String [] cols= c.split(",");
		System.out.println(Arrays.toString(cols));
	}

}
