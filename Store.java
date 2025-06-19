package dessert_store;

import java.util.Scanner;

public class Store {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String item = new String();
		String selected = new String();
		selected = "";
		int count = 0;
		while(!item.equals("Q")) {
			System.out.println("Available Items : Candy \n Cookie \n Ice Cream \n Enter Q to Quit");
			System.out.println("Enter desert : ");
			
			item = input.next();
			input.nextLine();
			switch(item) {
			case "candy":
			case "Candy":
				System.out.println("Enter Flavour : ");
				String nameCandy = input.next();
				input.nextLine();
				
				selected += "\n"+nameCandy;
				System.out.println("Enter quantity : ");
				int qtyCandy = input.nextInt();
				System.out.println("The Price is :  " );
				int priceCandy = input.nextInt();
				Candy candy = new Candy(nameCandy, priceCandy, qtyCandy);
				Cart.calculateBill(candy);
				
				
					break;
			case "cookie":
			case "Cookie":
				System.out.println("Enter Flavour : ");
				String nameCookie = input.next();
				input.nextLine();
				System.out.println("Enter quantity : ");
				int qtyCookie = input.nextInt();
				System.out.println("The Price is :  ");
				int priceCookie = input.nextInt();
				Cookie cookie = new Cookie(nameCookie, priceCookie, qtyCookie);
				Cart.calculateBill(cookie);
					break;
			case "IceCream":
			case "icecream":
				System.out.println("Enter Flavour : ");
				String nameIceCream = input.nextLine();
				input.nextLine();
				System.out.println("Enter quantity : ");
				int qtyIceCream = input.nextInt();
				System.out.println("The Price is :  ");
				int priceIceCream = input.nextInt();
				IceCream IceCream = new IceCream(nameIceCream, priceIceCream, qtyIceCream);
				Cart.calculateBill(IceCream);
					break;
			case "Q":
				
				System.out.println("The Bill is" );
				Cart.displayBill();
				default:
					System.out.println("Enter Valid Choice");
				break;
		
			}
		
		
		
		
		
		}
	}
	
}
