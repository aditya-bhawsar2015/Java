package day5;

public class DemoString {

	public static <string, string> void main(String[] args) {
		
		String s1 ="java";
		String s2 = "java";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String n1= new String("Java");
		String n2= new String("Java");
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		
		if(s1==s2)
			System.out.println("Strings are equal");
		
		//if(n1==n2) only used to assign or compare strings not objects 
		
		if(n1.equals(n2))
			System.out.println("String objects are equal");
		
		List<string> colors= new ArrayList<>();
		colors.add("black");
		colors.add("white");
		
		String c = String.join("," , colors);
		System.out.println(c);

	}

}
