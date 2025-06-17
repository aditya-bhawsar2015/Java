package day6;

import day4.Printable;

public class DemoAnno {

	public static void main(String[] args) {
		Printable p = new Printable() {
			
			@Override
			public void print() {
				System.out.println("In an annonymous class");
				
			}
		};

		p.print();
	}

}
