package dessert_store;

public class Cart {
	protected static double finalBill = 0;
	public static void calculateBill(Desserts item) {
		finalBill+= item.calculatePrice();
	}
	
	public static void displayBill() {
		System.out.println(finalBill);
	}
	
}
