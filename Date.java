package streamsAssignment;

public class Date {
    
    int year;
    String month;

    public Date(){
      this( "Oct", 2001);        
    }

    public Date( String month, int year){
        
        this.month=month;
        this.year=year;
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