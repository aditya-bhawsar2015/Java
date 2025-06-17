package day10;

public class Student {
	private int rollno;
	private String name;
	
	public Student()
	{
		rollno =1;
		name="aaa";
	}
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}	
	private void privateMethod()
	{
		System.out.println("This is a private Method");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is a static Method");
	}
	
	@CreatedBy(priority =  2, author = "abc")
	public void simpleMethod()
	{
		System.out.println("This is a public Method");
	}
	
	@CreatedBy(priority =  1, author = "xyz")
	public void setValues(int rollno, String name)
	{
		this.rollno=rollno;
		this.name =name;
		System.out.println("Values set to roll no: " + rollno + " name : "+ name);
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
