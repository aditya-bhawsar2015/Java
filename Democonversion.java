package day5;

public class Democonversion {
	
	//primitive to object
	int x=20;
	Integer y= Integer.valueOf(x);
	
	//object to primitive
	int z = y.intValue();
	
	//Parsing
	//String to primitive
	String s ="30";
	int a = Integer.parseInt(s);
	
	//String to object
	Integer b = Integer.valueOf(s);
	
	//Auto-boxing
	int i=10;
	Integer j = i;
	
	//Auto-unboxing
	int k=j;
	
}
