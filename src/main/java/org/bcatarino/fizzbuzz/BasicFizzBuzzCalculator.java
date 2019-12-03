package org.bcatarino.fizzbuzz;

public class BasicFizzBuzzCalculator implements FizzBuzzCalculator {

    private static final String INVALID_ARGUMENT = "The number must be positive";

    public String getResult(int number) {
        if (number <= 0) throw new IllegalArgumentException(INVALID_ARGUMENT);
        return String.valueOf(number);
    }
}
