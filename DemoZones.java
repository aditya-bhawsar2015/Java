package dateTimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoZones {

	public static void main(String[] args) {
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		LocalDateTime dt = LocalDateTime.of(2025, 12, 13, 5, 30, 25);
		System.out.println(dt);
		
		
		LocalDateTime dtnow = LocalDateTime.now();
		
		ZonedDateTime perth = dtnow.atZone(ZoneId.of("Australia/Perth"));
		System.out.println(perth);
		
		ZonedDateTime ist = dtnow.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(ist);
		
		Instant india = ist.toInstant();
		System.out.println(india);
		
		ZonedDateTime prth = india.atZone(ZoneId.of("Africa/Nairobi"));
		System.out.println(prth.toLocalDateTime());
		
	}

}
