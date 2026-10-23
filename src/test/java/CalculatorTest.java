//CS5800 - QUIZ 2
//RAJ AHIR - 019330454

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithNegativeValues() {
        int expected = -3;
        int actual = calculator.sum(-1, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithZero() {
        int expected = 5;
        int actual = calculator.sum(5, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractWithNegativeValues() {
        int expected = 1;
        int actual = calculator.subtract(-1, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractWithZero() {
        int expected = 3;
        int actual = calculator.subtract(3, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 2;
        int actual = calculator.multiply(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithZero() {
        int expected = 0;
        int actual = calculator.multiply(3, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithNegativeValue() {
        int expected = -6;
        int actual = calculator.multiply(-3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 2;
        int actual = calculator.divide(2,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void testIsOdd() {
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }
}


