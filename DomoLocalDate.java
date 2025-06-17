package day10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DomoLocalDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate diwali = LocalDate.of(2025, 10, 20);
		
		Period tilldiwali = today.until(diwali);
		//System.out.println(tilldiwali);
		System.out.println("Till to diwali : "+ tilldiwali.getMonths() + " months "+
		tilldiwali.getDays() + " days");
		
		long timetodiwali = today.until(diwali, ChronoUnit.DAYS);
		System.out.println("Days for diwali " + timetodiwali);
		
		System.out.println(diwali.plus(5, ChronoUnit.MONTHS));
		
		System.out.println(diwali.plusDays(7));
		System.out.println(diwali.plusYears(1));
		
		System.out.println("__________________________________");
		System.out.println(diwali.getDayOfMonth());
		System.out.println(diwali.getDayOfWeek());
		System.out.println(diwali.getYear());
		System.out.println(diwali.getMonth());
		System.out.println(diwali.getMonthValue());
		
		System.out.println("__________________________________");
		Stream<LocalDate> allyear= LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));

		List<LocalDate> blackfridays= allyear.filter((date) -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY) &&
				date.getDayOfMonth()==13).collect(Collectors.toList());
		System.out.println(blackfridays);
		
		System.out.println("__________________________________");
		System.out.println(diwali.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(diwali.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY)));
		System.out.println(diwali.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
		System.out.println(diwali.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(diwali.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
	}

}
