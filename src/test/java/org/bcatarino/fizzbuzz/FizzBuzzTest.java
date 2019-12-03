package org.bcatarino.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    /* I've chosen not to mock the FizzBuzzCalculator, given the low complexity of the problem to solve, but usually,
        I'd isolate the test so that only this component would be tested.
        Or maybe consider this not as a unit test, but more as an integration test of different components.
     */
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testCount0ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.forFirstN(0));
    }

    @Test
    public void testNegativeCountThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.forFirstN(-1));
    }

    @Test
    public void testCount1ReturnsOnlyOneElement() {
        assertEquals(List.of("1"), fizzBuzz.forFirstN(1));
    }

    @Test
    public void testCount5ReturnsFirstFiveElements() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), fizzBuzz.forFirstN(5));
    }

    @Test
    public void testCount16ReturnsFirstSixteenElements() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"), fizzBuzz.forFirstN(16));
    }
}
