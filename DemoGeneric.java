package day6;

public class DemoGeneric <T> {	
	T obj;	
	public void setData(T obj)
	{
		this.obj = obj;
	}
	public String getName()
	{
		return obj.getClass().getName();
	}
	public static void main(String[] args) {
		DemoGeneric<Integer> iobj = new DemoGeneric<>();
		iobj.setData(450);
		System.out.println(iobj.getName());
		
		DemoGeneric<String> sobj = new DemoGeneric<>();
		sobj.setData("java");
		System.out.println(sobj.getName());
	}

}
