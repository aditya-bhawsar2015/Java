package day4;

public interface Printable {
	void print();
	default void test()
	{
		System.out.println("This is a default behaviour - in Print");
	}
}
