# FizzBuzzJava
A FizzBuzz project in Java. The rules:

- Fizz if divisible by 3 or has a 3 in the number.
- Buzz if divisible by 5 or has a 5 in the number.
- FizzBuzz if both previous criteria are met.

## Notes and Considerations

- I thought of using a separate implementation of FizzBuzzCalculator for the extra criteria, but it seems this is a change in requirements, not a choice that would make sense having as a separate implementation, so I refactored the same implementation class.
- I thought about doing implementing it in feature branches, as I'd generally do in a professional project, but honestly for something this simple, it seems like over-engineering it.

## Pre-requisites

You need Maven installed and at least JDK 8.

## Building

As expected,  `mvn clean package`

## Executing the Tests

`mvn test`

## Executing the program

In the project folder, run 
`java -cp target\fizz-buzz-java-1.0-SNAPSHOT.jar org.bcatarino.fizzbuzz.FizzBuzz`

This will execute the project with a default of 100.

You can also run `java -cp target\fizz-buzz-java-1.0-SNAPSHOT.jar org.bcatarino.fizzbuzz.FizzBuzz 500`

To execute FizzBuzz for the first 500 numbers.

Or simply use or IDE tools.