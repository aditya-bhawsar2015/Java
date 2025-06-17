package assignments;

public class Remote {
	Curtain curtain;
	
	public Remote(Curtain curtain) {
		this.curtain = curtain;
	}

	public void operate()
	{
		if(curtain.isOpen())
		{
			System.out.println("Curtain is open");
			System.out.println("Closing the curtain");
			curtain.close();
			System.out.println("Curtain is closed");
		}
		else
		{
			System.out.println("Curtain is closed");
			System.out.println("Opening the curtain");
			curtain.open();
			System.out.println("Curtain is opened");
		}
	}
	
}
