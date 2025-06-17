package day2;

public class Date {
	private int day, year;
	private String month;	
	
	public Date()
	{
//		day = 1;
//		month = "Jan";
//		year = 1960;
		this(1, "Jan", 1960);
	}
	
	public Date(int day, String month, int year)
	{
		this.day = day;
		this.month=month;
		this.year= year;
	}
	public void setDay(int day)
	{
		this.day =day;
	}	
	public void setMonth(String month)
	{
		this.month =month;
	}
	public void setYear(int year)
	{
		this.year =year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return day + "/" + month + "/" + year;
	}
	
	
}
