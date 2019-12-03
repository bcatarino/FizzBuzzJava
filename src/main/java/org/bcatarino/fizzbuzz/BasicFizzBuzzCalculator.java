package org.bcatarino.fizzbuzz;

public class BasicFizzBuzzCalculator implements FizzBuzzCalculator {

    private static final String INVALID_ARGUMENT = "The number must be positive";

    public String getResult(int number) {
        if (number <= 0) throw new IllegalArgumentException(INVALID_ARGUMENT);

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
