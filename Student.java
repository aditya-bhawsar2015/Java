package day10Annotations;

public class Student {
	
	private int rollno;
	private String name;
	
	public Student()
	{
		rollno=1;
		name="aaaa";
	}

	public Student(int rollno, String name) 
	{	
		this.rollno = rollno;
		this.name = name;
	}
	
	private void privateMethod()
	{
		System.out.println("This method is private");
	}
	
	
	public static void staticMethod()
	{
		System.out.println("This is static mathod");
	}
	
	
	@CreatedBy(priority = 2, author ="abc")
	public void simpleMethod()
	{
		System.out.println("This is public method");
	}
	
	
	@CreatedBy(priority =1, author="xyz")
	public void setValues(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("Values set to roll no : " + rollno + "name : " + name);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		Student stu = new Student(15,"ab");
		System.out.println(stu);
		
		
	}
}
