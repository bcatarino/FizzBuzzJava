package org.bcatarino.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicFizzBuzzCalculatorTest {

    private FizzBuzzCalculator calculator = new BasicFizzBuzzCalculator();

    @Test
    public void testReturnsNumberStringForNumber() {
        assertEquals("1", calculator.getResult(1));
    }

    @Test
    public void testThrowsIllegalArgumentForNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> calculator.getResult(-1));
    }

    @Test
    public void testThrowsIllegalArgumentForZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.getResult(0));
    }

    @Test
    public void testReturnsFizzIf3() {
        assertEquals("Fizz", calculator.getResult(3));
    }

    @Test
    public void testReturnsFizzIfMultipleOf3() {
        assertEquals("Fizz", calculator.getResult(9));
    }

    @Test
    public void testReturnsBuzzIf5() {
        assertEquals("Buzz", calculator.getResult(5));
    }

    @Test
    public void testReturnsBuzzIfMultipleOf5() {
        assertEquals("Buzz", calculator.getResult(20));
    }
}
