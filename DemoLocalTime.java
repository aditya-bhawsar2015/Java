package day10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DemoLocalTime {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();		
		LocalTime noon = LocalTime.NOON;
		
		long timetonoon=now.until(noon, ChronoUnit.MINUTES);
		System.out.println(timetonoon + " mins");
		
		Duration intrval= Duration.between(noon, now);
		System.out.println(intrval);
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		
		System.out.println(now.plus(2, ChronoUnit.HOURS));
		System.out.println(now.plusMinutes(20));
		
		LocalDateTime dt = now.atDate(LocalDate.of(2025, 3, 11));
		System.out.println(dt);

	}

}
