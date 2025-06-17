package day4;

import java.util.ArrayList;
import java.util.List;

public class DemoClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> colors = new ArrayList<>();
		List<String> copy = new ArrayList<>();
		colors.add("Black");
		colors.add("White");
		
		NewCar c1 = new NewCar("Mahindra", "XUV", 2000000, colors);
		NewCar c2 = c1;	
		for(String c : colors)
		{
			copy.add(c);
		}
		NewCar c3 = new NewCar(c1.getMake(), c1.getModel(), c1.getPrice(), copy);
		NewCar c4 = (NewCar)c1.clone();		
		c1.setPrice(2200000);
		colors.add("Red");
		System.out.println("Original : " + c1);
		System.out.println("Shallow Copy " + c2);
		System.out.println("Deep Copy :" + c3);
		System.out.println("Clone : "+ c4);
		

	}

}
