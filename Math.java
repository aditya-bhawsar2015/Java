package day5;

public class Math {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int res = num1/num2;
			
			System.out.println(res);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
