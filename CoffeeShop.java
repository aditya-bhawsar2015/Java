package day3;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee coffee = Coffee.SMALL;
		
		System.out.println(coffee.getPrice());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of coffee : Small/Medium/Large");
		
		String type = sc.next();
		
		Coffee coff = Coffee.valueOf(type.toUpperCase());
		System.out.println(coff.getPrice());
		
		Coffee[] values = Coffee.values();
		for(Coffee c : values)
		{
			System.out.println(c);
		}
	}

}
