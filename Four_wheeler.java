package vehicle_insurance;

public class Four_wheeler extends Vehicle{
	public Four_wheeler(String registrationNo, String model, int year, double price, Policy policy) {
		super( registrationNo , model,  year, price, policy);
	}
	protected double calculateInsurance() {
		return price * 0.1;
	}
	@Override
	public void print() {
		
		
	}
}
