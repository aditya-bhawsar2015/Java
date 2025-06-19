package vehicle_insurance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Policy {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	LocalDate startDate = LocalDate.now();
	LocalDate expiryDate = LocalDate.now();
	
	
	static int policyNumber = 0;
	static int generatePolicyNumber() {
		return policyNumber++;
	}
	
	public Policy(LocalDate startDate, LocalDate expiryDate, int policyNum) {
		this.startDate = startDate;
		this.expiryDate = expiryDate;
		this.policyNumber = policyNum;
	}
	protected void insuranceAmount( Vehicle v){
		System.out.println("insurance Amount : " + v.calculateInsurance());
		
	}
	
	
	public void main(String[] args) {
		Two_wheeler bike = new Two_wheeler("MH12 3212", "pulsar", 2022, 150000, 
				new Policy(LocalDate.now(),LocalDate.now(), Policy.generatePolicyNumber() ));
		Four_wheeler car = new Four_wheeler("MH12 3213", "pulsar_car", 2023, 1050000,new Policy(LocalDate.now(),LocalDate.now(), Policy.generatePolicyNumber() ));
		
//		Policy policy = new Policy();
//		
//		policy.insuranceAmount(bike);
//		policy.insuranceAmount(car);
		
	}
}
