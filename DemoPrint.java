package mt;

public class DemoPrint {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40};
		MyArray ma = new MyArray(arr);
		PrintJob job = new PrintJob(ma);
		
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		
		t1.start();
		t2.start();

	}

}
