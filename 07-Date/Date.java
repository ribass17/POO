public class Date {
    private int Day;
    private int Month;
    private int Year;

    public Date(int day, int month, int year) {
        Day = day;
        Year = year;
        if (month >= 1 && month <= 12)
            Month = month;
        else
            Month = 1;
    }

    public void setDay(int day) {
        Day = day;
    }

    public void setMonth(int mounth) {
        if (month >= 1 && month <= 12)
            Month = month;
        else
            Month = 1;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public String showsDate() {
        return String.format("%d/%d/%d", Day, Month, Year);
    }
}
