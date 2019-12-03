package org.bcatarino.fizzbuzz;

public class BasicFizzBuzzCalculator implements FizzBuzzCalculator {

    private static final String INVALID_ARGUMENT_MSG = "The number must be positive";

    public String getResult(int number) {
        if (number <= 0) throw new IllegalArgumentException(INVALID_ARGUMENT_MSG);

        if (isMultipleOf3And5(number)) {
            return "FizzBuzz";
        }

        if (isMultipleOf5(number)) {
            return "Buzz";
        }

        if (isMultipleOf3(number)) {
            return "Fizz";
        }

        return String.valueOf(number);
    }

    private boolean isMultipleOf3And5(int number) {
        return number % 15 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
