package dateTime;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DemoLocalTime {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();		
		LocalTime noon = LocalTime.NOON;
		LocalTime midnight = LocalTime.MAX;
		LocalDateTime zoneNow = LocalDateTime.now();
		
		ZonedDateTime ist = zoneNow.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(ist);
		
		System.out.println(now);
		
		long timetonoon=now.until(noon, ChronoUnit.MINUTES);
		System.out.println(timetonoon + " mins");
		
		long tomidnight = now.until(midnight, ChronoUnit.HOURS);
		System.out.println(tomidnight);
		
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




