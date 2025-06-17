package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda {
	public static boolean opearteOnNumber(Predicate p , int number)
	{
		return p.test(number);
	}
	
	public static ArrayList<Integer> operateOnList(Predicate p, List<Integer> list)
	{
		ArrayList<Integer> filtered = new ArrayList<>();
		for(Integer i : list)
		{
			if(p.test(i))
				filtered.add(i);
		}
		return filtered;
	}
	public static void main(String[] args) {
		Integer [] arr= {12, 13, 14, 15, 16,17, 18, 19, 20};
		List<Integer> lst = Arrays.asList(arr);
		
		Predicate ispositive = (n) -> n>0;
 		System.out.println(ispositive.test(10));
		System.out.println(ispositive.test(-10));
		
		Predicate isprime = (n) ->
		{
			for(int i=2; i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		};
		
		System.out.println(isprime.test(23));
		System.out.println(isprime.test(18));

		boolean res=opearteOnNumber((n) -> n%2==0, 20);
		System.out.println(res);
		
		
		res =opearteOnNumber(isprime, 10);
		System.out.println(res);
		
		res =opearteOnNumber((n) ->
		{
			for(int i=2; i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}, 0);
		System.out.println(res);
		
		ArrayList<Integer> evens = operateOnList((n) -> n%2==0, lst);
		System.out.println(evens);
	
	}

}
