# FizzBuzzJava
A FizzBuzz project in Java.

## Notes and Considerations

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