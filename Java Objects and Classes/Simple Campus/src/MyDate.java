import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar gregorianCalendar;
    private String monthAsString;

    public MyDate(){
        gregorianCalendar = new GregorianCalendar();
        this.day = gregorianCalendar.get(Calendar.DATE);
        this.month = gregorianCalendar.get(Calendar.MONTH);
        this.year = gregorianCalendar.get(Calendar.YEAR);
    }

    public MyDate(long elapsedTime){
        gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.day = gregorianCalendar.get(Calendar.DATE);
        this.month = gregorianCalendar.get(Calendar.MONTH);
        this.year = gregorianCalendar.get(Calendar.YEAR);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public String printDate(){
        switch (getMonth()){
            case 0:
                monthAsString = "January";
                break;
            case 1:
                monthAsString = "February";
                break;
            case 2:
                monthAsString = "March";
                break;
            case 3:
                monthAsString = "April";
                break;
            case 4:
                monthAsString = "May";
                break;
            case 5:
                monthAsString = "June";
                break;
            case 6:
                monthAsString = "July";
                break;
            case 7:
                monthAsString = "August";
                break;
            case 8:
                monthAsString = "September";
                break;
            case 9:
                monthAsString = "October";
                break;
            case 10:
                monthAsString = "November";
                break;
            case 11:
                monthAsString = "December";
                break;
        }
        return getDay() + " " + monthAsString + " " + getYear();
    }
}
