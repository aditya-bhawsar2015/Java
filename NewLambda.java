package lambda;

public class NewLambda{
	public static <T> boolean operateOnData(NewPredicate<T> p, T data) {
		return p.test(data);
	}
	public static void main(String[] args) {
		NewPredicate<Integer> isPositive = (n) -> n%2==0;
		
		boolean ret = operateOnData(isPositive, 9);
		System.out.println(ret);
	}
	
	
	
}
