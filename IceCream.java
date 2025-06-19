package dessert_store;

public class IceCream extends Desserts {
	protected IceCream(String name , double price, int quantity)
	{
		super(name,price, quantity);
	}
	double calculatePrice() {
		return (quantity*price);
	}
	
}
