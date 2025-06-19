package dessert_store;

abstract public class Desserts {
	protected double price;
	protected String name;
	protected int quantity;
	abstract double calculatePrice();
	public Desserts(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
}
