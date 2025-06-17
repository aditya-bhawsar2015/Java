package day4;

import java.util.ArrayList;
import java.util.List;

import day2.Date;

public final class ImmutableCar {
	private final String make, model;
	private final int price;
	private final ArrayList<String> colors;
	private final Date mandate;
	
	public ImmutableCar(String make, String model, int price, ArrayList<String> colors, Date mandate) {
		ArrayList<String> copy = new ArrayList<>();
		this.make = make;
		this.model = model;
		this.price = price;
		for(String c : colors)
		{
			copy.add(c);
		}
		this.colors = copy;
		this.mandate = new Date(mandate.getDay(), mandate.getMonth(), mandate.getYear());
	}

	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	@SuppressWarnings("unchecked")
	public ArrayList<String> getColors() {
		return (ArrayList<String>)colors.clone();
	}
	public Date getMandate() {
		return new Date(mandate.getDay(), mandate.getMonth(), mandate.getYear());
	}

	@Override
	public String toString() {
		return "ImmutableCar [make=" + make + ", model=" + model + ", price=" + price + ", colors=" + colors
				+ ", mandate=" + mandate + "]";
	}
	
	
}
