package day4;

public interface Serializable {

	void writeToFile();
	
	default void test()
	{
		System.out.println("This is a default behaviour - in Print");
	}
}
