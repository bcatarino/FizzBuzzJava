package org.bcatarino.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzCalculatorTest {

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
}
