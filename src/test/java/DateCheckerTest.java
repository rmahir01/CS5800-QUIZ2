//CS5800 - QUIZ 2
//RAJ AHIR - 019330454

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY",
            "AUGUST", "OCTOBER", "DECEMBER"})

    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month));
    }
}

