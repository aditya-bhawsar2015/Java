package day3;

public enum Coffee {

	SMALL(50), MEDIUM(80), LARGE(100);
	private int price;
	private Coffee(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
}
