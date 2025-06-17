package mt;

public class PrintJob implements Runnable{

	MyArray arr;
	
	public PrintJob(MyArray arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		synchronized (arr) {
			arr.print();
		}		
	}

}
