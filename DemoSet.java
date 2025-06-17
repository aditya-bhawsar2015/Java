package day6;

import java.util.HashSet;
import java.util.Iterator;

public class DemoSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();		
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Python");
		set.add("Python");
		
		System.out.println(set);
		
		set.remove("Python");
		System.out.println(set);
		
		for(String s : set)
		{
			System.out.println(s);
		}
		Iterator<String> it= set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
