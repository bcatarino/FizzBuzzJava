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
    public void testReturnsFizzIfHas3() {
        assertEquals("Fizz", calculator.getResult(734));
    }

    @Test
    public void testReturnsFizzIfHasMultiple3s() {
        assertEquals("Fizz", calculator.getResult(737232341));
    }

    @Test
    public void testReturnsBuzzIf5() {
        assertEquals("Buzz", calculator.getResult(5));
    }

    @Test
    public void testReturnsBuzzIfMultipleOf5() {
        assertEquals("Buzz", calculator.getResult(20));
    }

    @Test
    public void testReturnsBuzzIfHas5() {
        assertEquals("Buzz", calculator.getResult(58));
    }

    @Test
    public void testReturnsBuzzIfHasMultiple5s() {
        assertEquals("Buzz", calculator.getResult(755262541));
    }

    @Test
    public void testReturnsFizzBuzzIfMinimumMultipleOf3And5() {
        assertEquals("FizzBuzz", calculator.getResult(15));
    }

    @Test
    public void testReturnsFizzBuzzIfMultipleOf3And5() {
        assertEquals("FizzBuzz", calculator.getResult(60));
    }

    @Test
    public void testReturnsFizzBuzzIfMultipleOf3AndHas5() {
        assertEquals("FizzBuzz", calculator.getResult(51));
    }

    @Test
    public void testReturnsFizzBuzzIfMultipleOf5AndHas3() {
        assertEquals("FizzBuzz", calculator.getResult(230));
    }

    @Test
    public void testReturnsFizzBuzzIfHas3And5() {
        assertEquals("FizzBuzz", calculator.getResult(53));
    }
}
