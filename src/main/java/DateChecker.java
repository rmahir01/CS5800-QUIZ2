//CS5800 - QUIZ 2
//RAJ AHIR - 019330454

import java.util.Arrays;

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
        if(month == null){
            throw new IllegalArgumentException("Month cannot be null.");
        }
        if(month == month.FEBRUARY){
            return false;
        }
        if(Arrays.asList(monthThirtyOneDays).contains(month)){
            return true;
        }
        else{
            return false;
        }
    }
}
