package twitter;

public class Date {
    int day;
    int year;
    String month;

    public Date(){
      this(12, "Oct", 2001);        
    }

    public Date(int day, String month, int year){
        this.day =day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString()
    {
        return day+"/"+month+"/"+year;
        
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        this.day=day;
    }
    public String getMonth(){
        return this.month;
    }
    public void setMonth(String month){
        this.month=month;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }
}