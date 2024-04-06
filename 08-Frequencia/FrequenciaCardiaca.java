import java.util.Calendar;

public class FrequenciaCardiaca {
    private String FristName;
    private String LastName;
    private int Day;
    private int Month;
    private int Year;

    public FrequenciaCardiaca(String firstName, String lastName, int day, int month, int year) {
        FristName = firstName;
        LastName = lastName;
        Day = day;
        Month = month;
        Year = year;
    }

    public String getFristName() {
        return FristName;
    }

    public void setFristName(String fristName) {
        FristName = fristName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int calculateAge() {
        var c = Calendar.getInstance();
        if (Month <= c.get(Calendar.MONTH)+1)
            if(Month < c.get(Calendar.MONTH) + 1 ||  Day >= c.get(Calendar.DAY_OF_MONTH))
                return c.get(Calendar.YEAR) - Year;
        return c.get(Calendar.YEAR) - (Year + 1);
    }

    public int getMaximumRate() {
        return 220 - calculateAge();
    }

    public int getIdealRate() {
        return (int) getMaximumRate() / 2;
    }
}
