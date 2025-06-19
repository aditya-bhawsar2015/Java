package day3;

public class Manager extends SalariedEmployee{
		protected double allowance;
		
		public Manager(int empid, String name, double basic, double allowance) {
			super(empid,name,basic);
			this.allowance=allowance;
		}
		@Override
		protected double calculateGross() {
			return super.calculateGross() + allowance;
		}
		
		protected void displayAllowance() {
			System.out.println("Allowance : "+ allowance);
		}
		
		
		
		
}
