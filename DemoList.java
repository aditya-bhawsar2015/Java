package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoList {
	public static void main(String[] args) {
		ArrayList lst = new ArrayList<>();
		
		lst.add(434);
		lst.add(23.6f);
		lst.add(true);
		lst.add("one");
		
//		int j = (Integer)lst.get(2); ClassCastException
//		System.out.println(j); 
		
		lst.remove(1);
		
		for(int i =0; i<lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}
		
		for(Object o: lst)
		{
			System.out.println(o);
		}
		
	   Iterator it=	lst.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }

	 
	}

}
