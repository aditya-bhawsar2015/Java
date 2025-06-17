package assignments;

import java.util.Scanner;

import day2.Date;

public class Store {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dessert :"); 
		String item = sc.next();
		
		switch (item) {
		case "Candy":
			System.out.println("Enter quantity : ");
			int qy = sc.nextInt();
			break;
		case "Cookie":
			
			break;
		case "Ice Cream":
			
			break;
		default:
			break;
		}
	}

}
