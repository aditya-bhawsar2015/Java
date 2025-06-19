package day5;

public class ThrowsExcepiton {
	public static void divide(String s1, String s2) throws ArithmeticException, ArrayIndexOutOfBoundsException,
	NumberFormatException
	{
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		int res= num1/num2;
		
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		try 
		{
			ThrowsExcepiton.divide(args[0], args[1]);
		}
		catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("After try-catch");
		}
		
	}

}
