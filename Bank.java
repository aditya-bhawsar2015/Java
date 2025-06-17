package day4;

public class Bank {
	
	public void saveData(Serializable obj)
	{
		obj.writeToFile();
	}

	public static void main(String[] args) {
		Address add = new Address(34, "ttttt", "Pune", "MH", 411004);
		Account acc1 = new Account(758745, "aaa", 900000, add);
		
		System.out.println(acc1);
		
		Account acc2 = new Account(546475, "ssss", 80000, new Address
				(4, "rrrrr", "Mumbai", "MH", 400001));
		
		System.out.println(acc2);
		
		/*
		 * Once super class implements an interfaces all the sub classes
		 * inherit the implemented methods
		 */
		SavingsAccount sa = new SavingsAccount(4545656, "ppp", 800000, add);
		sa.print();
		sa.writeToFile();

	}

}
