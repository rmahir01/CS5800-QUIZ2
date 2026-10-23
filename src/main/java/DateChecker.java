//CS5800 - QUIZ 2
//RAJ AHIR - 019330454

public class DateChecker {

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY,
                                                      Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month){
        return false;
    }
}
