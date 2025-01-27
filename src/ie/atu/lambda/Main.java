package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Step 1: Define a lambda to trim spaces from a string
        Function<String, String> trimSpaces = s -> s.trim();

        // Step 2: Define a lambda to convert the string to lowercase
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        // Step 3: Combine the two lambdas using andThen
        Function<String, String> combinedOperation = trimSpaces.andThen(toLowerCase);

        // Step 4: Apply the combined operation on a string
        String input = "  Lambda FUNCTION Example  ";
        String result = combinedOperation.apply(input);

        // Step 5: Output the result
        System.out.println("Result: \"" + result + "\"");
    }
}
