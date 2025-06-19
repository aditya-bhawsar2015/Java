package lambda;

public class NewLambda2 {
	public static <T> boolean operateOnData(NewPredicate<T> p, T data)
	{
		return p.test(data);
	}

	public static void main(String[] args) {
		
		boolean res = operateOnData((s) -> s.endsWith("lambda"),
				"Hello people how are you all?");
		System.out.println(res);
		
		res=operateOnData((n) -> n%10==0, 1005);
		System.out.println(res);
		
	}
}
