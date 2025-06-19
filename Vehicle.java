package vehicle_insurance;

abstract public class Vehicle implements Printable {
	String registrationNo, model;
	int year;
	double price;
	Policy policy;
	
	public Vehicle(String registrationNo, String model, int year, double price, Policy policy) {
		this.registrationNo = registrationNo;
		this.model = model;
		this.year = year;
		this.price = price;
		this.policy = policy;
	}
	
	protected abstract double calculateInsurance();
}
