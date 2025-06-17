package assignments;

public class Curtain {

	private boolean isopen;	
	public Curtain(boolean isopen) {
		super();
		this.isopen = isopen;
	}

	public boolean isOpen()
	{
		return isopen;
	}
	
	public void open()
	{
		isopen = true;
	}
	
	public void close()
	{
		isopen = false;
	}
}
