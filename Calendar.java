package day2;

public class Calendar {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(12, "March", 2020);
		System.out.println(d2);
		
		d2.setDay(13);
		System.out.println(d2.getDay());

	}

}
