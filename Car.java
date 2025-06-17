package day4;

import java.util.Objects;

public class Car {
	private String make, model;
	private int price;
	public Car(String make, String model, int price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + "]";
	}	
	@Override
	public boolean equals(Object o)
	{
		Car other =(Car)o;
		if(this.make.equals(other.make) && this.model.equals(other.model)
				&&this.price==other.price)
			return true;
		else
			return false;			
	}
	
	@Override 
	public int hashCode()
	{
		return 13 + make.hashCode() + model.hashCode()+ price;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(make, model, price);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Car other = (Car) obj;
//		return Objects.equals(make, other.make) && Objects.equals(model, other.model) && price == other.price;
//	}
	
	
	
}
