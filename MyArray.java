package mt;

public class MyArray {

	int []arr;

	public MyArray(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public void print()
	{
		for(int i : arr)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
