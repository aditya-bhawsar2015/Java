package day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FomatParse {
	public static void main(String[] args) {
		//From date object to String: format 
		LocalDateTime dtnow = LocalDateTime.now();
		System.out.println(dtnow);
		
		String mydate= dtnow.format(DateTimeFormatter.ofPattern("YY/MM/dd HH:mm:ss"));
		System.out.println(mydate);
		
		mydate= dtnow.format(DateTimeFormatter.ofPattern("E-L-YYYY hh:mm a"));
		System.out.println(mydate);
		
		//String to date object : parse
		String date ="25/03/10 10:40:28";
		LocalDateTime dt = LocalDateTime.parse(date, DateTimeFormatter.
				ofPattern("yy/MM/dd HH:mm:ss"));
		System.out.println(dt);
	}

}
