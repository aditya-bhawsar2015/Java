package dateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatParse {

	public static void main(String[] args) {
		// Format date object to string conversion order can be anything based on us
		LocalDateTime dtnow = LocalDateTime.now();
		System.out.println(dtnow);
		
		String mydate = dtnow.format(DateTimeFormatter.ofPattern("YY/MM/dd HH:mm:ss"));
		System.out.println(mydate);
		
		mydate = dtnow.format(DateTimeFormatter.ofPattern("E-L-YYYY hh:mm a"));
		System.out.println(mydate);
		
			
	//parse string to date matching the values here is necessary : same as that of string if not done
	//parsing can't be done
		
		String date = "25/03/10 10:40:28";
		LocalDateTime dt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss"));
		System.out.println(dt);
	
	}

}
