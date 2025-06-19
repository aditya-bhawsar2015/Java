package dateTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DemoLocalTime {
	//hours minute seconds representation
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime noon = LocalTime.NOON;
		System.out.println(noon);
		
		long timetonoon = now.until(noon, ChronoUnit.MINUTES);
		System.out.println(timetonoon + "mins");
		
		Duration interval = Duration.between(noon, now);
		System.out.println(interval);
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		
		System.out.println(now.plus(2,ChronoUnit.HOURS));
		System.out.println(now.plusMinutes(20));
		
		LocalDateTime dt = now.atDate(LocalDate.of(2025, 4, 11));
		System.out.println(dt);
		
		
	}
}
