package dessert_store;

public class Candy extends Desserts {
	public Candy(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	double calculatePrice() {
		return (quantity*price)/1000;
	}
}
