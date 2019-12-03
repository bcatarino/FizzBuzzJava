package org.bcatarino.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    private static final String ILLEGAL_COUNT_MSG = "Count number must be more than 0";

    // As an exercise, using direct implementation rather than dependency injection.
    private FizzBuzzCalculator fizzBuzzCalculator = new BasicFizzBuzzCalculator();

    public static void main(String... args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.forFirstN(100);
        result.forEach(System.out::println);
    }

    List<String> forFirstN(int count) {
        if (count <= 0) throw new IllegalArgumentException(ILLEGAL_COUNT_MSG);
        return IntStream.range(1, count + 1)
                        .mapToObj(x -> fizzBuzzCalculator.getResult(x))
                        .collect(Collectors.toList());
    }
}
