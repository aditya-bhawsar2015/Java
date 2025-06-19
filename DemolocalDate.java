package dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemolocalDate {

	public static void main(String[] args) {
			
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate rakhi = LocalDate.of(2025, 8, 22);
		
		Period tillrakhi = today.until(rakhi);
		System.out.println("Months till Rakhi : " + tillrakhi.getMonths() + " months and " +tillrakhi.getDays() 
		+ " days");
		
		long timetorakhi = today.until(rakhi, ChronoUnit.DAYS);
		System.out.println("Days to go : " + timetorakhi + " days");
		
		System.out.println(rakhi.plus(5, ChronoUnit.MONTHS));
		
		System.out.println(rakhi.plusDays(6));
		System.out.println(rakhi.plusWeeks(2));
		
		System.out.println("----------------------------------------");
		
		System.out.println(rakhi.getDayOfMonth());
		System.out.println(rakhi.getDayOfWeek());
		System.out.println(rakhi.getYear());
		System.out.println(rakhi.getMonth());
		System.out.println(rakhi.getMonthValue());
		
		System.out.println("-----------------------------------------------");
		
		Stream<LocalDate> allyear = LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));
		
		List<LocalDate> blackfridays = allyear.filter((date) -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY)
				&& date.getDayOfMonth()==13).collect(Collectors.toList());
		System.out.println(blackfridays);
		
		System.out.println("-------------------------------------");
		System.out.println(rakhi.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(rakhi.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY)));
		System.out.println(rakhi.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
		System.out.println(rakhi.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(rakhi.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		
	}
}
