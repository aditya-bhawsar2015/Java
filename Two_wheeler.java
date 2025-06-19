package vehicle_insurance;

public class Two_wheeler extends Vehicle {
	
	public Two_wheeler(String registrationNo, String model, int year, double price, Policy policy) {
		super(registrationNo, model, year, price, policy);
	}
	protected double calculateInsurance() {
		return price*0.05;
	}
	@Override
	public void print() {
		System.out.println("");
		
	}
}
