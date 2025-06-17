package day4;

import java.util.ArrayList;
import java.util.List;

import day2.Date;

public class TestImmutable {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Black");
		colors.add("White");
		Date mandate = new Date(12, "Aug", 2020);
		
		ImmutableCar c1 = new ImmutableCar("Mahindra", "XUV", 2000000, colors, mandate);
		System.out.println(c1);
		c1.getColors().add("Red");
		c1.getMandate().setDay(23);
		System.out.println(c1);

	}

}
