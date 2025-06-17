package day7;

public class GenericLambda {
	public static <T> boolean operateOnData(NewPredicate<T> p, T data)
	{
		return p.test(data);
	}
	
	public static boolean isPrime(int n)
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {		
		boolean res = operateOnData((s) -> s.endsWith("lambda"), 
				"Java 8 introduced a new feature lambda");
		System.out.println(res);
		
		res = operateOnData((n) -> n%10==0, 100);
		System.out.println(res);	

		res = operateOnData(GenericLambda::isPrime, 7);
		System.out.println(res);
		
		res = operateOnData(Character::isUpperCase, 'H');
		System.out.println(res);
		
		
	}

}
