package day7;

public class ExceptionLambda {
	public static String OperateOnString(StringFunction func, String s) throws EmptyStringException
	{
		if(s.equals(""))
		{
			throw new EmptyStringException("String is Empty");
		}
		else
			return func.apply(s);
	}
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		try {
			String lower =OperateOnString((str) -> str.toLowerCase(), "");
			System.out.println(lower);
		} 
		catch (EmptyStringException e) {
			e.printStackTrace();
		}
		
		try {
			String lower =OperateOnString(String:: toLowerCase, s);
			System.out.println(lower);
		} 
		catch (EmptyStringException e) {
			e.printStackTrace();
		}

	}

}
