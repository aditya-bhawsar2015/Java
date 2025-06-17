package assignments;

public class AccountThread {

	public static void main(String[] args) {
		Account acc = new Account(5000);
		
		Thread withdraw = new Thread(new Runnable() {
			
			@Override
			public void run() {
//				for(int i=0;i<2;i++)
//				{
					acc.withdraw(10000);
//				}
			}
		});
		
		Thread deposit = new Thread(new Runnable() {
			
			@Override
			public void run() {
//				for(int i=0;i<2;i++)
//				{
					acc.deposit(10000);
//				}
				
			}
		});
		withdraw.start();
		deposit.start();

	}

}
