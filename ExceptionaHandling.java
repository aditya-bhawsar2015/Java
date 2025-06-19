package day5;

public class ExceptionaHandling {

	public static void main(String[] args) {
		try {
		int num1= Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int res = num1/num2;
		
		System.out.println(res);
	}
	catch (ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	catch (NumberFormatException e)
		{
		System.out.println(e.getMessage());
		}
	catch (ArrayIndexOutOfBoundsException e)
		{
		 System.out.println(e.getMessage());
		}
		
	}
}
