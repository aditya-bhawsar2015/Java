package dessert_store;

public class Cookie extends Desserts{
	protected Cookie(String name, double price, int quantity)
	{
		super(name,price, quantity);
	}
	double calculatePrice() {
		return (quantity*price)/12;
	}
}
