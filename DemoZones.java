package day10;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoZones {

	public static void main(String[] args) {
		Set<String> zones= ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		LocalDateTime dt = LocalDateTime.of(2025, 12, 13, 5, 30,00);
		LocalDateTime dtnow = LocalDateTime.now();
//		ZonedDateTime perth = dtnow.atZone(ZoneId.of("Australia/Perth"));
//		System.out.println(perth);
		
		ZonedDateTime ist = dtnow.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(ist);
		Instant india = ist.toInstant();
		System.out.println(india);
		
		ZonedDateTime perth = india.atZone(ZoneId.of("Australia/Perth"));
		System.out.println(perth.toLocalDateTime());
		

	}

}
