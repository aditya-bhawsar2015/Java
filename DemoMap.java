package day6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();		
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 333);
		map.put("ccc", 444);
		
		System.out.println(map);
				
		map.remove("ccc");
		System.out.println(map);
		
		System.out.println(map.get("aaa"));
		
		for(String key : map.keySet())
		{
			System.out.println(key + "->" + map.get(key));
		}

	 	Set<Entry<String, Integer>> entries= map.entrySet();
	 	for(Entry<String, Integer> entry : entries)
	 	{
	 		System.out.println(entry.getKey() + " -> "+ entry.getValue());
	 	}
	
	}

}
