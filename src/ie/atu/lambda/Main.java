package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression for MathOperation (Addition)
        MathOperation addition = (a, b) -> a + b;  // Lambda for addition
        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8

        // Using a lambda expression for StringOperation (To Upper Case)
        StringOperation toUpperCase = str -> str.toUpperCase(); // Lambda for uppercase
        String result = toUpperCase.apply("hello world");
        System.out.println("Result: " + result); // Output: "HELLO WORLD"
    }
}
