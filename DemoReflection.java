package day10Annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class DemoReflection {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
		Student s = new Student();
		
		Class c = s.getClass();
		System.out.println("Field info");
		
		Field [] fields = c.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getType());
			if(field.getName().equals("rollno"))
			{
				field.setAccessible(true);
				field.setInt(s, 10);
			}
		}
		System.out.println(s);
		System.out.println("Constructor info");
		Constructor [] cons = c.getDeclaredConstructors();
		for(Constructor con : cons)
		{
			System.out.println(con.getParameterCount());
			if(con.getParameterCount()==2)
			{
				Parameter [] params =con.getParameters();
				System.out.println(Arrays.toString(params));
				
				Student s1 = (Student) con.newInstance(12, "ccc");
				System.out.println(s1);
			}
		}
		
		System.out.println("Method info");
		Method [] methods = c.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName());
			if(method.getName().equals("privateMthod"))
			{
				method.setAccessible(true);
				method.invoke(s);
			}
			if(method.getName().equals("staticMethod"))
			{
				method.setAccessible(true);
				method.invoke(null);
			}
			if(method.getName().equals("setValues"))
			{
				Parameter [] params = method.getParameters();
				System.out.println(Arrays.toString(params));
				method.setAccessible(true);
				method.invoke(s, 13 , "pppp");
			}
		}
		
		System.out.println("Annotations");
		methods = c.getDeclaredMethods();
		for(Method method : methods)
		{
			if(method.getDeclaredAnnotation(CreatedBy.class)!=null)
			{
				CreatedBy info  = method.getDeclaredAnnotation(CreatedBy.class);
				if(info.priority()==2)
				{
					method.invoke(s);
				}
			}
		} 
	}
}
