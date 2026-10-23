//CS5800 - QUIZ 2
//RAJ AHIR - 019330454

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY",
            "AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month), month + " should have 31 days.");
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHave31Days(DateChecker.Month month){
        assertFalse(dateChecker.has31Days(month), month + " should not have 31 days.");
    }

    @Test
    void testFebruaryDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.FEBRUARY), "February has 28 days in a common year or 29 days in a leap year");
    }
}

