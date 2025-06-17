package assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatParse {

	public static void main(String[] args) {
		LocalDateTime dtnow = LocalDateTime.now();
		
		String mydate = dtnow.format(DateTimeFormatter.ofPattern("YY/MM/DD HH:mm:ss"));
		System.out.println(mydate);
		
		LocalDateTime dt = LocalDateTime.parse(mydate, DateTimeFormatter.
				ofPattern("yy/MM/DD HH:mm:ss"));
		System.out.println(dt);

	}

}
