package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DemoLambda {
	
	public static boolean operateOnNumber(Predicate p, int number)
	{
		return p.test(number);
	}
	
	public static int newOperation(Int p, int number) {
		return p.check(number);
	}
	
	public static ArrayList<Integer> operationOnList(Predicate p, List<Integer> list){
		ArrayList<Integer> filtered = new ArrayList<>();
		for(Integer e : list) {
			if(p.test(e)) {
				filtered.add(e);
			}
		}
		return filtered;
	}

	public static void main(String[] args) {
		
		Predicate ispositive = (n) -> n>0;
		
		System.out.println(ispositive.test(10));
		System.out.println(ispositive.test(-10));
		
		Predicate isprime = (n)->
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		};
		
		System.out.println(isprime.test(79));
		System.out.println(isprime.test(3));
		Int square = (n) -> n*n;
		
		Int factorial = (n) ->{
			if(n==0) 
				return 1;
			for(int i=n-1; i>0; i--) {
				n=n*i;
			}
			return n;
		
		};
		System.out.println(square.check(5));
		System.out.println(factorial.check(6));
		
		boolean res = operateOnNumber((n) -> n%2==0, 20);
		System.out.println(res);
		
		res = operateOnNumber ((n) ->
		{
			for(int i=2;i<n;i++)
			{
				if(n%2==0)
					return false;
			}
			return true;
		},59);
		System.out.println(res);
		
		Int cube = (n) -> n*n*n;
		
		int result = newOperation(cube, 5);
		
		System.out.println(result);
		result = newOperation((n)->{
			
			for(int i = n-1; i >0; i--) {
				n = n*i;
			}
			return n;
		},4);
		System.out.println(result);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(-2);
		list.add(5);
		list.add(3);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array = operationOnList(ispositive, list);
		
		System.out.println(array);
		
	}

	
	
	
	
	
}
