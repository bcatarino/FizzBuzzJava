package org.bcatarino.fizzbuzz;

public class BasicFizzBuzzCalculator implements FizzBuzzCalculator {

    private static final String INVALID_ARGUMENT_MSG = "The number must be positive";

    public String getResult(int number) {
        if (number <= 0) throw new IllegalArgumentException(INVALID_ARGUMENT_MSG);

        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }

        if (isBuzz(number)) {
            return "Buzz";
        }

        if (isFizz(number)) {
            return "Fizz";
        }

        return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }

    private boolean isFizz(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }
}
