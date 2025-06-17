package assignments;

public class Controller {

	public static void main(String[] args) {
		Curtain curtain = new Curtain(false);
		Remote remote = new Remote(curtain);
		
		remote.operate();
		System.out.println("__________________");
		remote.operate();

	}

}
